package aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect //注解表示这是一个切面
@Component //表示这是一个bean,由Spring进行管理
public class LoggerAspect {
    @Pointcut(value ="execution(public * service.ProductService.*(..))" )
    @Order(1)
    public void pointCut(){};


    @Around(value = "pointCut()")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        //getSignature 获取切点的签名
        //proceed() 执行切点本来的业务
        System.out.println("start log:" + joinPoint.getSignature().getName());
        Object object = joinPoint.proceed();
        System.out.println("end log:" + joinPoint.getSignature().getName());
        return object;
    }

    @Before(value = "execution(* service.ProductService.*(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("方法执行前执行......before");
    }

    @After("execution(* service.ProductService.*(..))")
    public void after() {
        System.out.println("方法之后执行...after.");


    }
}