/*
 * This Spock specification was auto generated by running the Gradle 'init' task
 * by 'zcfrank1st' at '12/22/16 8:56 AM' with Gradle 3.2.1
 *
 * @author zcfrank1st, @date 12/22/16 8:56 AM
 */

import spock.lang.Specification

class LibraryTest extends Specification{
    def "someLibraryMethod returns true"() {
        setup:
        WatchmanPlugin lib = new WatchmanPlugin()
        when:
        def result = lib.someLibraryMethod()
        then:
        result == true
    }
}
