package com.seckill.web.service;


import com.seckill.support.rpc.dto.SettlementOrderDTO;
import com.seckill.web.exception.BizException;
import com.seckill.web.model.SettlementInitDTO;
import com.seckill.web.model.SettlementSubmitDTO;

import java.util.Map;

public interface SettlementService {

    SettlementInitDTO initData(String productId, String buyNum) throws BizException;

    Map<String,Object> dependency();

    SettlementSubmitDTO submitOrder(SettlementOrderDTO requestDTO) throws BizException;

}
