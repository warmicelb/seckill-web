package com.seckill.web.service;


import com.seckill.support.rpc.dto.SeckillActivityDTO;
import com.seckill.support.rpc.dto.base.Result;

public interface SeckillActivityService {

    Result<Integer> createActivity(SeckillActivityDTO activityDTO);

}
