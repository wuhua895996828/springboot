package com.woody.healthIndicator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**   
 * Copyright © 2017 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.woody.healthIndicator 
 * @author: wh   
 * @date: 2017年12月5日 上午9:33:57 
 */
@Component
public class MyHealthIndicator  implements HealthIndicator{

	@Override
	public Health health() {
		return Health.up().withDetail("test", "ok").build();
	}
	
	

}

