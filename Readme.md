This is a sample to demo how the to use MDC (LOGBack) with Springboot.

How to run,

1. Start as a normal Spring Application.

2. Invoke following URL,

`http://localhost:8080/person?personId=123`

3. Logs similar to below should be displayed,


```29-01-2019 11:07:03.129 [http-nio-8080-exec-1] INFO  e.b.e.controllers.PersonController.getPerson - Request received at the controller. PersonId: 123 requestId=c6acd0ff-9c6a-4153-a12b-42f0100509a4```

```29-01-2019 11:07:03.176 [http-nio-8080-exec-1] INFO  e.b.e.services.PersonInfoService.getPersonInfo - Person info retrieved. Content: {"id":"123","name":"John","age":27} requestId=c6acd0ff-9c6a-4153-a12b-42f0100509a4```

4. Note that requestId is logged with each log message.