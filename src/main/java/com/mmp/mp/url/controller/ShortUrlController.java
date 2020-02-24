package com.mmp.mp.url.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mmp.common.configer.page.PageRequest;
import com.mmp.mp.url.entity.ShortUrl;
import com.mmp.mp.url.service.impl.ShortUrlServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author chenguangxu
 * @since 2020-01-09
 */
@RestController
@RequestMapping("/url")
public class ShortUrlController {

    @Autowired
    private ShortUrlServiceImpl shortUrlService;

    @ApiOperation(value = "page")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    Object page(@RequestBody PageRequest pageRequest) {
        try {
            PageHelper.startPage(pageRequest.getPageNum(), pageRequest.getPageSize());
            return new PageInfo<>(shortUrlService.list());
        } catch (Exception e) {
            e.printStackTrace();
            return "失败";
        }
    }


    @ApiOperation(value = "获取所有数据")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    Object list() {
        try {
            return shortUrlService.list();
        } catch (Exception e) {
            return "失败";
        }
    }

    @ApiOperation(value = "通过id删除数据")
    @RequestMapping(value = "/removeById", method = RequestMethod.DELETE)
    Object removeById(@RequestParam Long id) {
        try {
            shortUrlService.removeById(id);
            return "成功";
        } catch (Exception e) {
            return "失败";
        }
    }

    @ApiOperation(value = "通过短链接获取原始地址")
    @RequestMapping(value = "/getByUrl", method = RequestMethod.GET)
    Object getByUrl(@RequestParam String url) {
        try {
            QueryWrapper<ShortUrl> queryWrapper = new QueryWrapper<>();
            queryWrapper.lambda().eq(ShortUrl::getUrlKey, url);
            return shortUrlService.getMap(queryWrapper);
        } catch (Exception e) {
            return "失败";
        }
    }

}
