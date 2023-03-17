package com.brain.bei.rpc.client.net;

import com.brain.bei.rpc.common.domain.Service;

/**
 * 网络客户端接口
 * @author Brain
 * @date 2023/3/16
 */
public interface NetClient {

  /**
   * 发送请求
   * @param data 发送的数据
   * @param service 目标服务
   * @return
   */
  byte[] sendRequest(byte[] data, Service service);

}
