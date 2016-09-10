package com.ares.framework.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.springframework.stereotype.Component;


@Component
public class ServiceMgr {

   @Inject
   private List<AresController> jRpcServices;
		
	@PostConstruct
	public void Init(){
		for(AresController  service : jRpcServices){
			String serviceName = service.getClass().getSimpleName();
			jServiceMaps.put(serviceName, service);
		}
	}
	
  
  public AresController  GetService(String serviceName){
	  return jServiceMaps.get(serviceName);
  }
	
    private   Map<String,AresController>  jServiceMaps = new HashMap<>();
}
