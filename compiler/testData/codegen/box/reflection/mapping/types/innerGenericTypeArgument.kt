// IGNORE_BACKEND: JVM_IR
// TARGET_BACKEND: JVM

// WITH_REFLECT

import kotlin.reflect.jvm.javaType
import kotlin.test.assertEquals

class Outer<A, B> {
    inner class Inner<C, D> {
        inner class Innermost<E, F>
    }
}

fun foo(): Outer<Int, Number>.Inner<String, Float>.Innermost<Any, Any?> = null!!

fun box(): String {
    assertEquals(
            listOf(
                    Any::class.java,
                    Any::class.java,
                    String::class.java,
                    Float::class.javaObjectType,
                    Int::class.javaObjectType,
                    Number::class.java
            ),
            ::foo.returnType.arguments.map { it.type!!.javaType }
    )

    return "OK"
}
