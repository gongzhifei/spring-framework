# Bean加载过程
## XmlBeanFactory
XmlBeanFactory > DefaultListableBeanFactory > AbstractAutowireCapableBeanFactory > AbstractBeanFactory
### Bean加载过程
1. reader.loadBeanDefinitions(resource)
2. doLoadBeanDefinitions(inputSource, encodedResource.getResource())
   1. 将resource转换成Document.
   2. 获取BeanDefinitionDocumentReader对象用于解析XML文件.
   3. documentReader.registerBeanDefinitions(doc, createReaderContext(resource)) 注册BeanDefinition
   4. doRegisterBeanDefinitions(doc.getDocumentElement())
   5. BeanDefinitionParserDelegate 专门解析由XML转成Document的类
   6. 
     
3. 