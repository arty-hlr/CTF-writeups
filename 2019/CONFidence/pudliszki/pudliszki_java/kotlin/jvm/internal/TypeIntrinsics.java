package kotlin.jvm.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.jvm.internal.markers.KMappedMarker;

public class TypeIntrinsics
{
  public TypeIntrinsics() {}
  
  private static <T extends Throwable> T sanitizeStackTrace(T throwable)
  {
    return Intrinsics.sanitizeStackTrace(throwable, TypeIntrinsics.class.getName());
  }
  
  public static void throwCce(Object argument, String requestedClassName) {
    String argumentClassName = argument == null ? "null" : argument.getClass().getName();
    throwCce(argumentClassName + " cannot be cast to " + requestedClassName);
  }
  
  public static void throwCce(String message) {
    throw throwCce(new ClassCastException(message));
  }
  
  public static ClassCastException throwCce(ClassCastException e) {
    throw ((ClassCastException)sanitizeStackTrace(e));
  }
  
  public static boolean isMutableIterator(Object obj) {
    return ((obj instanceof Iterator)) && ((!(obj instanceof KMappedMarker)) || ((obj instanceof kotlin.jvm.internal.markers.KMutableIterator)));
  }
  
  public static Iterator asMutableIterator(Object obj)
  {
    if (((obj instanceof KMappedMarker)) && (!(obj instanceof kotlin.jvm.internal.markers.KMutableIterator))) {
      throwCce(obj, "kotlin.collections.MutableIterator");
    }
    return castToIterator(obj);
  }
  
  public static Iterator asMutableIterator(Object obj, String message) {
    if (((obj instanceof KMappedMarker)) && (!(obj instanceof kotlin.jvm.internal.markers.KMutableIterator))) {
      throwCce(message);
    }
    return castToIterator(obj);
  }
  
  public static Iterator castToIterator(Object obj) {
    try {
      return (Iterator)obj;
    }
    catch (ClassCastException e) {
      throw throwCce(e);
    }
  }
  
  public static boolean isMutableListIterator(Object obj) {
    return ((obj instanceof java.util.ListIterator)) && ((!(obj instanceof KMappedMarker)) || ((obj instanceof kotlin.jvm.internal.markers.KMutableListIterator)));
  }
  
  public static java.util.ListIterator asMutableListIterator(Object obj)
  {
    if (((obj instanceof KMappedMarker)) && (!(obj instanceof kotlin.jvm.internal.markers.KMutableListIterator))) {
      throwCce(obj, "kotlin.collections.MutableListIterator");
    }
    return castToListIterator(obj);
  }
  
  public static java.util.ListIterator asMutableListIterator(Object obj, String message) {
    if (((obj instanceof KMappedMarker)) && (!(obj instanceof kotlin.jvm.internal.markers.KMutableListIterator))) {
      throwCce(message);
    }
    return castToListIterator(obj);
  }
  
  public static java.util.ListIterator castToListIterator(Object obj) {
    try {
      return (java.util.ListIterator)obj;
    }
    catch (ClassCastException e) {
      throw throwCce(e);
    }
  }
  
  public static boolean isMutableIterable(Object obj) {
    return ((obj instanceof Iterable)) && ((!(obj instanceof KMappedMarker)) || ((obj instanceof kotlin.jvm.internal.markers.KMutableIterable)));
  }
  
  public static Iterable asMutableIterable(Object obj)
  {
    if (((obj instanceof KMappedMarker)) && (!(obj instanceof kotlin.jvm.internal.markers.KMutableIterable))) {
      throwCce(obj, "kotlin.collections.MutableIterable");
    }
    return castToIterable(obj);
  }
  
  public static Iterable asMutableIterable(Object obj, String message) {
    if (((obj instanceof KMappedMarker)) && (!(obj instanceof kotlin.jvm.internal.markers.KMutableIterable))) {
      throwCce(message);
    }
    return castToIterable(obj);
  }
  
  public static Iterable castToIterable(Object obj) {
    try {
      return (Iterable)obj;
    }
    catch (ClassCastException e) {
      throw throwCce(e);
    }
  }
  
  public static boolean isMutableCollection(Object obj) {
    return ((obj instanceof Collection)) && ((!(obj instanceof KMappedMarker)) || ((obj instanceof kotlin.jvm.internal.markers.KMutableCollection)));
  }
  
  public static Collection asMutableCollection(Object obj)
  {
    if (((obj instanceof KMappedMarker)) && (!(obj instanceof kotlin.jvm.internal.markers.KMutableCollection))) {
      throwCce(obj, "kotlin.collections.MutableCollection");
    }
    return castToCollection(obj);
  }
  
  public static Collection asMutableCollection(Object obj, String message) {
    if (((obj instanceof KMappedMarker)) && (!(obj instanceof kotlin.jvm.internal.markers.KMutableCollection))) {
      throwCce(message);
    }
    return castToCollection(obj);
  }
  
  public static Collection castToCollection(Object obj) {
    try {
      return (Collection)obj;
    }
    catch (ClassCastException e) {
      throw throwCce(e);
    }
  }
  
  public static boolean isMutableList(Object obj) {
    return ((obj instanceof List)) && ((!(obj instanceof KMappedMarker)) || ((obj instanceof kotlin.jvm.internal.markers.KMutableList)));
  }
  
  public static List asMutableList(Object obj)
  {
    if (((obj instanceof KMappedMarker)) && (!(obj instanceof kotlin.jvm.internal.markers.KMutableList))) {
      throwCce(obj, "kotlin.collections.MutableList");
    }
    return castToList(obj);
  }
  
  public static List asMutableList(Object obj, String message) {
    if (((obj instanceof KMappedMarker)) && (!(obj instanceof kotlin.jvm.internal.markers.KMutableList))) {
      throwCce(message);
    }
    return castToList(obj);
  }
  
  public static List castToList(Object obj) {
    try {
      return (List)obj;
    }
    catch (ClassCastException e) {
      throw throwCce(e);
    }
  }
  
  public static boolean isMutableSet(Object obj) {
    return ((obj instanceof Set)) && ((!(obj instanceof KMappedMarker)) || ((obj instanceof kotlin.jvm.internal.markers.KMutableSet)));
  }
  
  public static Set asMutableSet(Object obj)
  {
    if (((obj instanceof KMappedMarker)) && (!(obj instanceof kotlin.jvm.internal.markers.KMutableSet))) {
      throwCce(obj, "kotlin.collections.MutableSet");
    }
    return castToSet(obj);
  }
  
  public static Set asMutableSet(Object obj, String message) {
    if (((obj instanceof KMappedMarker)) && (!(obj instanceof kotlin.jvm.internal.markers.KMutableSet))) {
      throwCce(message);
    }
    return castToSet(obj);
  }
  
  public static Set castToSet(Object obj) {
    try {
      return (Set)obj;
    }
    catch (ClassCastException e) {
      throw throwCce(e);
    }
  }
  
  public static boolean isMutableMap(Object obj) {
    return ((obj instanceof Map)) && ((!(obj instanceof KMappedMarker)) || ((obj instanceof kotlin.jvm.internal.markers.KMutableMap)));
  }
  
  public static Map asMutableMap(Object obj)
  {
    if (((obj instanceof KMappedMarker)) && (!(obj instanceof kotlin.jvm.internal.markers.KMutableMap))) {
      throwCce(obj, "kotlin.collections.MutableMap");
    }
    return castToMap(obj);
  }
  
  public static Map asMutableMap(Object obj, String message) {
    if (((obj instanceof KMappedMarker)) && (!(obj instanceof kotlin.jvm.internal.markers.KMutableMap))) {
      throwCce(message);
    }
    return castToMap(obj);
  }
  
  public static Map castToMap(Object obj) {
    try {
      return (Map)obj;
    }
    catch (ClassCastException e) {
      throw throwCce(e);
    }
  }
  
  public static boolean isMutableMapEntry(Object obj) {
    return ((obj instanceof Map.Entry)) && ((!(obj instanceof KMappedMarker)) || ((obj instanceof kotlin.jvm.internal.markers.KMutableMap.Entry)));
  }
  
  public static Map.Entry asMutableMapEntry(Object obj)
  {
    if (((obj instanceof KMappedMarker)) && (!(obj instanceof kotlin.jvm.internal.markers.KMutableMap.Entry))) {
      throwCce(obj, "kotlin.collections.MutableMap.MutableEntry");
    }
    return castToMapEntry(obj);
  }
  
  public static Map.Entry asMutableMapEntry(Object obj, String message) {
    if (((obj instanceof KMappedMarker)) && (!(obj instanceof kotlin.jvm.internal.markers.KMutableMap.Entry))) {
      throwCce(message);
    }
    return castToMapEntry(obj);
  }
  
  public static Map.Entry castToMapEntry(Object obj) {
    try {
      return (Map.Entry)obj;
    }
    catch (ClassCastException e) {
      throw throwCce(e);
    }
  }
  
  public static int getFunctionArity(Object obj) {
    if ((obj instanceof FunctionBase)) {
      return ((FunctionBase)obj).getArity();
    }
    if ((obj instanceof kotlin.jvm.functions.Function0)) {
      return 0;
    }
    if ((obj instanceof kotlin.jvm.functions.Function1)) {
      return 1;
    }
    if ((obj instanceof kotlin.jvm.functions.Function2)) {
      return 2;
    }
    if ((obj instanceof kotlin.jvm.functions.Function3)) {
      return 3;
    }
    if ((obj instanceof kotlin.jvm.functions.Function4)) {
      return 4;
    }
    if ((obj instanceof kotlin.jvm.functions.Function5)) {
      return 5;
    }
    if ((obj instanceof kotlin.jvm.functions.Function6)) {
      return 6;
    }
    if ((obj instanceof kotlin.jvm.functions.Function7)) {
      return 7;
    }
    if ((obj instanceof kotlin.jvm.functions.Function8)) {
      return 8;
    }
    if ((obj instanceof kotlin.jvm.functions.Function9)) {
      return 9;
    }
    if ((obj instanceof kotlin.jvm.functions.Function10)) {
      return 10;
    }
    if ((obj instanceof kotlin.jvm.functions.Function11)) {
      return 11;
    }
    if ((obj instanceof kotlin.jvm.functions.Function12)) {
      return 12;
    }
    if ((obj instanceof kotlin.jvm.functions.Function13)) {
      return 13;
    }
    if ((obj instanceof kotlin.jvm.functions.Function14)) {
      return 14;
    }
    if ((obj instanceof kotlin.jvm.functions.Function15)) {
      return 15;
    }
    if ((obj instanceof kotlin.jvm.functions.Function16)) {
      return 16;
    }
    if ((obj instanceof kotlin.jvm.functions.Function17)) {
      return 17;
    }
    if ((obj instanceof kotlin.jvm.functions.Function18)) {
      return 18;
    }
    if ((obj instanceof kotlin.jvm.functions.Function19)) {
      return 19;
    }
    if ((obj instanceof kotlin.jvm.functions.Function20)) {
      return 20;
    }
    if ((obj instanceof kotlin.jvm.functions.Function21)) {
      return 21;
    }
    if ((obj instanceof kotlin.jvm.functions.Function22)) {
      return 22;
    }
    
    return -1;
  }
  
  public static boolean isFunctionOfArity(Object obj, int arity)
  {
    return ((obj instanceof kotlin.Function)) && (getFunctionArity(obj) == arity);
  }
  
  public static Object beforeCheckcastToFunctionOfArity(Object obj, int arity)
  {
    if ((obj != null) && (!isFunctionOfArity(obj, arity))) {
      throwCce(obj, "kotlin.jvm.functions.Function" + arity);
    }
    return obj;
  }
  
  public static Object beforeCheckcastToFunctionOfArity(Object obj, int arity, String message) {
    if ((obj != null) && (!isFunctionOfArity(obj, arity))) {
      throwCce(message);
    }
    return obj;
  }
}
