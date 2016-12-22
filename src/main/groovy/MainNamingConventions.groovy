import org.gradle.api.tasks.SourceSet

/**
 * Created by zcfrank1st on 22/12/2016.
 */
class MainNamingConventions implements NamingConventions {
    @Override
    String getJavaCompileTaskName(final SourceSet sourceSet) {
        return "compileJava"
    }

    @Override
    String getAspectCompileTaskName(final SourceSet sourceSet) {
        return "compileAspect"
    }

    @Override
    String getAspectPathConfigurationName(final SourceSet sourceSet) {
        return "aspectpath"
    }

    @Override
    String getAspectInpathConfigurationName(final SourceSet sourceSet) {
        return "ajInpath"
    }
}
