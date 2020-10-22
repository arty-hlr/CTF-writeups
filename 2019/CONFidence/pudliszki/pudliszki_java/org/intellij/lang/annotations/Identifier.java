package org.intellij.lang.annotations;

import java.lang.annotation.Annotation;

@Pattern("\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*")
public @interface Identifier {}
