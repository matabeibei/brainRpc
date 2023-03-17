package com.brain.bei.rpc.client.discovery;


import com.brain.bei.rpc.common.domain.Service;
import java.util.List;

/**
 * 服务发现接口
 *
 * @author Brain
 * @date 2023/3/16
 */
public interface ServiceDiscovery {

  /**
   * 获取服务
   * @param name 服务名
   * @return
   */
  List<Service> getService(String name);
}
