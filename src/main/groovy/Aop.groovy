import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * Created by zcfrank1st on 22/12/2016.
 */
class AopGen extends DefaultTask {

    @TaskAction
    public void generateAopFile() {
        def aopFile = new File("${project.rootDir}/src/main/java/GlobalAspectj.java")
        aopFile.createNewFile()
        aopFile.write("""
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by zcfrank1st on 21/12/2016.
 */
@Aspect
public class GlobalAspectj {

    @Pointcut(value = "execution(* android.app.Activity.*(..))")
    public void DemoPointCut() {}

    @Around("DemoPointCut()")
    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("demo demo");
        point.proceed();
    }
}
""")
    }
}

class AopClear extends DefaultTask {
    @TaskAction
    public void removeAOPFile() {
        def aopFile = new File("${project.rootDir}/src/main/java/GlobalAspectj.java")
        aopFile.delete()
    }
}
