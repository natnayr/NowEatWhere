package com.ryan.shapes;

import java.util.Iterator;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class DisplayNameBeanProcessor implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("My Bean Processor Factory is being called");
		
		Iterator<String> names = beanFactory.getBeanNamesIterator();
		while(names.hasNext()){
			System.out.println(names.next());
		}
	}

}
