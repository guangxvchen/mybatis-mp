package com.mmp.mp.url.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mmp.mp.url.entity.ShortUrl;
import com.mmp.mp.url.mapper.ShortUrlMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author chenguangxu
 * @since 2020-01-09
 */
@Service
public class ShortUrlServiceImpl extends ServiceImpl<ShortUrlMapper, ShortUrl> implements IService<ShortUrl> {

}
