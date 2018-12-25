/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.js.test.semantics;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/box/arrays")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class JsLegacyPrimitiveArraysBoxTestGenerated extends AbstractJsLegacyPrimitiveArraysBoxTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS, testDataFilePath);
    }

    public void testAllFilesPresentInArrays() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/box/arrays"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JS, true);
    }

    @TestMetadata("arrayConstructorsSimple.kt")
    public void testArrayConstructorsSimple() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/arrayConstructorsSimple.kt");
    }

    @TestMetadata("arrayGetAssignMultiIndex.kt")
    public void testArrayGetAssignMultiIndex() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/arrayGetAssignMultiIndex.kt");
    }

    @TestMetadata("arrayGetMultiIndex.kt")
    public void testArrayGetMultiIndex() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/arrayGetMultiIndex.kt");
    }

    @TestMetadata("arrayInstanceOf.kt")
    public void testArrayInstanceOf() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/arrayInstanceOf.kt");
    }

    @TestMetadata("arrayPlusAssign.kt")
    public void testArrayPlusAssign() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/arrayPlusAssign.kt");
    }

    @TestMetadata("arraysAreCloneable.kt")
    public void testArraysAreCloneable() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/arraysAreCloneable.kt");
    }

    @TestMetadata("cloneArray.kt")
    public void testCloneArray() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/cloneArray.kt");
    }

    @TestMetadata("clonePrimitiveArrays.kt")
    public void testClonePrimitiveArrays() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/clonePrimitiveArrays.kt");
    }

    @TestMetadata("collectionAssignGetMultiIndex.kt")
    public void testCollectionAssignGetMultiIndex() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/collectionAssignGetMultiIndex.kt");
    }

    @TestMetadata("collectionGetMultiIndex.kt")
    public void testCollectionGetMultiIndex() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/collectionGetMultiIndex.kt");
    }

    @TestMetadata("forEachBooleanArray.kt")
    public void testForEachBooleanArray() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/forEachBooleanArray.kt");
    }

    @TestMetadata("forEachByteArray.kt")
    public void testForEachByteArray() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/forEachByteArray.kt");
    }

    @TestMetadata("forEachCharArray.kt")
    public void testForEachCharArray() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/forEachCharArray.kt");
    }

    @TestMetadata("forEachDoubleArray.kt")
    public void testForEachDoubleArray() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/forEachDoubleArray.kt");
    }

    @TestMetadata("forEachFloatArray.kt")
    public void testForEachFloatArray() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/forEachFloatArray.kt");
    }

    @TestMetadata("forEachIntArray.kt")
    public void testForEachIntArray() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/forEachIntArray.kt");
    }

    @TestMetadata("forEachLongArray.kt")
    public void testForEachLongArray() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/forEachLongArray.kt");
    }

    @TestMetadata("forEachShortArray.kt")
    public void testForEachShortArray() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/forEachShortArray.kt");
    }

    @TestMetadata("genericArrayInObjectLiteralConstructor.kt")
    public void testGenericArrayInObjectLiteralConstructor() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/genericArrayInObjectLiteralConstructor.kt");
    }

    @TestMetadata("hashMap.kt")
    public void testHashMap() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/hashMap.kt");
    }

    @TestMetadata("inProjectionAsParameter.kt")
    public void testInProjectionAsParameter() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/inProjectionAsParameter.kt");
    }

    @TestMetadata("inProjectionOfArray.kt")
    public void testInProjectionOfArray() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/inProjectionOfArray.kt");
    }

    @TestMetadata("inProjectionOfList.kt")
    public void testInProjectionOfList() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/inProjectionOfList.kt");
    }

    @TestMetadata("indices.kt")
    public void testIndices() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/indices.kt");
    }

    @TestMetadata("indicesChar.kt")
    public void testIndicesChar() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/indicesChar.kt");
    }

    @TestMetadata("inlineInitializer.kt")
    public void testInlineInitializer() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/inlineInitializer.kt");
    }

    @TestMetadata("iterator.kt")
    public void testIterator() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/iterator.kt");
    }

    @TestMetadata("iteratorBooleanArray.kt")
    public void testIteratorBooleanArray() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/iteratorBooleanArray.kt");
    }

    @TestMetadata("iteratorByteArray.kt")
    public void testIteratorByteArray() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/iteratorByteArray.kt");
    }

    @TestMetadata("iteratorByteArrayNextByte.kt")
    public void testIteratorByteArrayNextByte() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/iteratorByteArrayNextByte.kt");
    }

    @TestMetadata("iteratorCharArray.kt")
    public void testIteratorCharArray() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/iteratorCharArray.kt");
    }

    @TestMetadata("iteratorDoubleArray.kt")
    public void testIteratorDoubleArray() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/iteratorDoubleArray.kt");
    }

    @TestMetadata("iteratorFloatArray.kt")
    public void testIteratorFloatArray() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/iteratorFloatArray.kt");
    }

    @TestMetadata("iteratorIntArray.kt")
    public void testIteratorIntArray() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/iteratorIntArray.kt");
    }

    @TestMetadata("iteratorLongArray.kt")
    public void testIteratorLongArray() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/iteratorLongArray.kt");
    }

    @TestMetadata("iteratorLongArrayNextLong.kt")
    public void testIteratorLongArrayNextLong() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/iteratorLongArrayNextLong.kt");
    }

    @TestMetadata("iteratorShortArray.kt")
    public void testIteratorShortArray() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/iteratorShortArray.kt");
    }

    @TestMetadata("kt1291.kt")
    public void testKt1291() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/kt1291.kt");
    }

    @TestMetadata("kt238.kt")
    public void testKt238() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/kt238.kt");
    }

    @TestMetadata("kt2997.kt")
    public void testKt2997() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/kt2997.kt");
    }

    @TestMetadata("kt33.kt")
    public void testKt33() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/kt33.kt");
    }

    @TestMetadata("kt3771.kt")
    public void testKt3771() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/kt3771.kt");
    }

    @TestMetadata("kt4118.kt")
    public void testKt4118() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/kt4118.kt");
    }

    @TestMetadata("kt4348.kt")
    public void testKt4348() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/kt4348.kt");
    }

    @TestMetadata("kt4357.kt")
    public void testKt4357() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/kt4357.kt");
    }

    @TestMetadata("kt503.kt")
    public void testKt503() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/kt503.kt");
    }

    @TestMetadata("kt594.kt")
    public void testKt594() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/kt594.kt");
    }

    @TestMetadata("kt7009.kt")
    public void testKt7009() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/kt7009.kt");
    }

    @TestMetadata("kt7288.kt")
    public void testKt7288() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/kt7288.kt");
    }

    @TestMetadata("kt7338.kt")
    public void testKt7338() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/kt7338.kt");
    }

    @TestMetadata("kt779.kt")
    public void testKt779() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/kt779.kt");
    }

    @TestMetadata("kt945.kt")
    public void testKt945() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/kt945.kt");
    }

    @TestMetadata("kt950.kt")
    public void testKt950() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/kt950.kt");
    }

    @TestMetadata("longAsIndex.kt")
    public void testLongAsIndex() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/longAsIndex.kt");
    }

    @TestMetadata("multiArrayConstructors.kt")
    public void testMultiArrayConstructors() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/multiArrayConstructors.kt");
    }

    @TestMetadata("nonLocalReturnArrayConstructor.kt")
    public void testNonLocalReturnArrayConstructor() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/nonLocalReturnArrayConstructor.kt");
    }

    @TestMetadata("nonNullArray.kt")
    public void testNonNullArray() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/nonNullArray.kt");
    }

    @TestMetadata("primitiveArrays.kt")
    public void testPrimitiveArrays() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/primitiveArrays.kt");
    }

    @TestMetadata("stdlib.kt")
    public void testStdlib() throws Exception {
        runTest("compiler/testData/codegen/box/arrays/stdlib.kt");
    }

    @TestMetadata("compiler/testData/codegen/box/arrays/arraysOfInlineClass")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ArraysOfInlineClass extends AbstractJsLegacyPrimitiveArraysBoxTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS, testDataFilePath);
        }

        @TestMetadata("accessArrayOfInlineClass.kt")
        public void testAccessArrayOfInlineClass() throws Exception {
            runTest("compiler/testData/codegen/box/arrays/arraysOfInlineClass/accessArrayOfInlineClass.kt");
        }

        @TestMetadata("accessArrayOfUnsigned.kt")
        public void testAccessArrayOfUnsigned() throws Exception {
            runTest("compiler/testData/codegen/box/arrays/arraysOfInlineClass/accessArrayOfUnsigned.kt");
        }

        public void testAllFilesPresentInArraysOfInlineClass() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/box/arrays/arraysOfInlineClass"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JS, true);
        }

        @TestMetadata("arrayOfInlineClassOfArrayOfInlineClass.kt")
        public void testArrayOfInlineClassOfArrayOfInlineClass() throws Exception {
            runTest("compiler/testData/codegen/box/arrays/arraysOfInlineClass/arrayOfInlineClassOfArrayOfInlineClass.kt");
        }
    }

    @TestMetadata("compiler/testData/codegen/box/arrays/multiDecl")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class MultiDecl extends AbstractJsLegacyPrimitiveArraysBoxTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS, testDataFilePath);
        }

        public void testAllFilesPresentInMultiDecl() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/box/arrays/multiDecl"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JS, true);
        }

        @TestMetadata("kt15560.kt")
        public void testKt15560() throws Exception {
            runTest("compiler/testData/codegen/box/arrays/multiDecl/kt15560.kt");
        }

        @TestMetadata("kt15568.kt")
        public void testKt15568() throws Exception {
            runTest("compiler/testData/codegen/box/arrays/multiDecl/kt15568.kt");
        }

        @TestMetadata("kt15575.kt")
        public void testKt15575() throws Exception {
            runTest("compiler/testData/codegen/box/arrays/multiDecl/kt15575.kt");
        }

        @TestMetadata("MultiDeclFor.kt")
        public void testMultiDeclFor() throws Exception {
            runTest("compiler/testData/codegen/box/arrays/multiDecl/MultiDeclFor.kt");
        }

        @TestMetadata("MultiDeclForComponentExtensions.kt")
        public void testMultiDeclForComponentExtensions() throws Exception {
            runTest("compiler/testData/codegen/box/arrays/multiDecl/MultiDeclForComponentExtensions.kt");
        }

        @TestMetadata("MultiDeclForComponentMemberExtensions.kt")
        public void testMultiDeclForComponentMemberExtensions() throws Exception {
            runTest("compiler/testData/codegen/box/arrays/multiDecl/MultiDeclForComponentMemberExtensions.kt");
        }

        @TestMetadata("MultiDeclForComponentMemberExtensionsInExtensionFunction.kt")
        public void testMultiDeclForComponentMemberExtensionsInExtensionFunction() throws Exception {
            runTest("compiler/testData/codegen/box/arrays/multiDecl/MultiDeclForComponentMemberExtensionsInExtensionFunction.kt");
        }

        @TestMetadata("MultiDeclForValCaptured.kt")
        public void testMultiDeclForValCaptured() throws Exception {
            runTest("compiler/testData/codegen/box/arrays/multiDecl/MultiDeclForValCaptured.kt");
        }

        @TestMetadata("compiler/testData/codegen/box/arrays/multiDecl/int")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Int extends AbstractJsLegacyPrimitiveArraysBoxTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS, testDataFilePath);
            }

            public void testAllFilesPresentInInt() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/box/arrays/multiDecl/int"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JS, true);
            }

            @TestMetadata("MultiDeclForComponentExtensions.kt")
            public void testMultiDeclForComponentExtensions() throws Exception {
                runTest("compiler/testData/codegen/box/arrays/multiDecl/int/MultiDeclForComponentExtensions.kt");
            }

            @TestMetadata("MultiDeclForComponentExtensionsValCaptured.kt")
            public void testMultiDeclForComponentExtensionsValCaptured() throws Exception {
                runTest("compiler/testData/codegen/box/arrays/multiDecl/int/MultiDeclForComponentExtensionsValCaptured.kt");
            }

            @TestMetadata("MultiDeclForComponentMemberExtensions.kt")
            public void testMultiDeclForComponentMemberExtensions() throws Exception {
                runTest("compiler/testData/codegen/box/arrays/multiDecl/int/MultiDeclForComponentMemberExtensions.kt");
            }

            @TestMetadata("MultiDeclForComponentMemberExtensionsInExtensionFunction.kt")
            public void testMultiDeclForComponentMemberExtensionsInExtensionFunction() throws Exception {
                runTest("compiler/testData/codegen/box/arrays/multiDecl/int/MultiDeclForComponentMemberExtensionsInExtensionFunction.kt");
            }
        }

        @TestMetadata("compiler/testData/codegen/box/arrays/multiDecl/long")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Long extends AbstractJsLegacyPrimitiveArraysBoxTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS, testDataFilePath);
            }

            public void testAllFilesPresentInLong() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/box/arrays/multiDecl/long"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JS, true);
            }

            @TestMetadata("MultiDeclForComponentExtensions.kt")
            public void testMultiDeclForComponentExtensions() throws Exception {
                runTest("compiler/testData/codegen/box/arrays/multiDecl/long/MultiDeclForComponentExtensions.kt");
            }

            @TestMetadata("MultiDeclForComponentExtensionsValCaptured.kt")
            public void testMultiDeclForComponentExtensionsValCaptured() throws Exception {
                runTest("compiler/testData/codegen/box/arrays/multiDecl/long/MultiDeclForComponentExtensionsValCaptured.kt");
            }

            @TestMetadata("MultiDeclForComponentMemberExtensions.kt")
            public void testMultiDeclForComponentMemberExtensions() throws Exception {
                runTest("compiler/testData/codegen/box/arrays/multiDecl/long/MultiDeclForComponentMemberExtensions.kt");
            }

            @TestMetadata("MultiDeclForComponentMemberExtensionsInExtensionFunction.kt")
            public void testMultiDeclForComponentMemberExtensionsInExtensionFunction() throws Exception {
                runTest("compiler/testData/codegen/box/arrays/multiDecl/long/MultiDeclForComponentMemberExtensionsInExtensionFunction.kt");
            }
        }
    }
}
