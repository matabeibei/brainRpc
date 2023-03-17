package com.brain.bei.rpc.client.discovery;

import com.brain.bei.rpc.common.constant.BrainRpcConstant;
import com.brain.bei.rpc.common.domain.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.I0Itec.zkclient.ZkClient;

/**
 * 服务发现--zk实现
 * @author Brain
 * @date 2023/3/16
 */
public class ZookeeperServiceDiscovery implements ServiceDiscovery{


  private ZkClient zkClient;

  public ZookeeperServiceDiscovery(String zkAddress) {
    zkClient = new ZkClient(zkAddress);
  }

  /**
   * 使用zk作注册中心，通过服务名获取服务列表
   * @param name 服务名
   * @return
   */
  @Override
  public List<Service> getService(String name) {
    List<String> children = zkClient.getChildren(BrainRpcConstant.REGISTER_PATH);
    List<Service> services = Optional.ofNullable(children).orElse(new ArrayList<>()).stream().map(chd -> {
      String[] array = chd.split(":");
      Service service = new Service();
      service.setAddress(array[0]);
      service.setPort(array[1]);
      return service;
    }).collect(Collectors.toList());
    return services;
  }
}
