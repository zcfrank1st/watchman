import org.gradle.api.tasks.SourceSet

/**
 * Created by zcfrank1st on 22/12/2016.
 */
class DefaultNamingConventions implements NamingConventions {

    @Override
    String getJavaCompileTaskName(final SourceSet sourceSet) {
        return "compile${sourceSet.name.capitalize()}Java"
    }

    @Override
    String getAspectCompileTaskName(final SourceSet sourceSet) {
        return "compile${sourceSet.name.capitalize()}Aspect"
    }

    @Override
    String getAspectPathConfigurationName(final SourceSet sourceSet) {
        return "${sourceSet.name}Aspectpath"
    }

    @Override
    String getAspectInpathConfigurationName(final SourceSet sourceSet) {
        return "${sourceSet.name}AjInpath"
    }
}

