package com.maven.SpringAnno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MediaTek implements MobileProcessor {
	public void processor() {
		// TODO Auto-generated method stub
		System.out.println("MediaTek processor");
	}

}
