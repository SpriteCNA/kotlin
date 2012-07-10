// http://youtrack.jetbrains.net/issue/KT-451
// KT-451 Incorrect character literals cause assertion failures

fun ff() {
    val <!UNUSED_VARIABLE!>b<!> = <!ERROR_COMPILE_TIME_VALUE!>''<!>
    val <!UNUSED_VARIABLE!>c<!> = <!ERROR_COMPILE_TIME_VALUE!>'23'<!>
    val <!UNUSED_VARIABLE!>d<!> = <!ERROR_COMPILE_TIME_VALUE!>'a<!>
    val <!UNUSED_VARIABLE!>e<!> = <!ERROR_COMPILE_TIME_VALUE!>'ab<!>
    val <!UNUSED_VARIABLE!>f<!> = <!ERROR_COMPILE_TIME_VALUE!>'\'<!>
}

fun test() {
    <!UNUSED_EXPRESSION!>'a'<!>
    <!UNUSED_EXPRESSION!>'\n'<!>
    <!UNUSED_EXPRESSION!>'\t'<!>
    <!UNUSED_EXPRESSION!>'\b'<!>
    <!UNUSED_EXPRESSION!>'\r'<!>
    <!UNUSED_EXPRESSION!>'\"'<!>
    <!UNUSED_EXPRESSION!>'\''<!>
    <!UNUSED_EXPRESSION!>'\\'<!>
    <!UNUSED_EXPRESSION!>'\$'<!>
    <!ERROR_COMPILE_TIME_VALUE, UNUSED_EXPRESSION!>'\x'<!>
    <!ERROR_COMPILE_TIME_VALUE, UNUSED_EXPRESSION!>'\123'<!>
    <!ERROR_COMPILE_TIME_VALUE, UNUSED_EXPRESSION!>'\ra'<!>
    <!ERROR_COMPILE_TIME_VALUE, UNUSED_EXPRESSION!>'\000'<!>
    <!ERROR_COMPILE_TIME_VALUE, UNUSED_EXPRESSION!>'\000'<!>
    <!UNUSED_EXPRESSION!>'\u0000'<!>
    <!UNUSED_EXPRESSION!>'\u000a'<!>
    <!UNUSED_EXPRESSION!>'\u000A'<!>
    <!ERROR_COMPILE_TIME_VALUE, UNUSED_EXPRESSION!>'\u'<!>
    <!ERROR_COMPILE_TIME_VALUE, UNUSED_EXPRESSION!>'\u0'<!>
    <!ERROR_COMPILE_TIME_VALUE, UNUSED_EXPRESSION!>'\u00'<!>
    <!ERROR_COMPILE_TIME_VALUE, UNUSED_EXPRESSION!>'\u000'<!>
    <!ERROR_COMPILE_TIME_VALUE, UNUSED_EXPRESSION!>'\u000z'<!>
    <!ERROR_COMPILE_TIME_VALUE, UNUSED_EXPRESSION!>'\\u000'<!>
    <!ERROR_COMPILE_TIME_VALUE, UNUSED_EXPRESSION!>'\'<!>
}