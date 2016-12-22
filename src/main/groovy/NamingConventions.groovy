/**
 * Created by zcfrank1st on 22/12/2016.
 */
import org.gradle.api.tasks.SourceSet

interface NamingConventions {

    String getJavaCompileTaskName(SourceSet sourceSet)

    String getAspectCompileTaskName(SourceSet sourceSet)

    String getAspectPathConfigurationName(SourceSet sourceSet)

    String getAspectInpathConfigurationName(SourceSet sourceSet)
}
