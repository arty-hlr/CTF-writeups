package kotlin.collections;

import java.util.Iterator;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000*\n\000\n\002\020\002\n\000\n\002\020\b\n\002\b\002\n\002\020(\n\002\020 \n\002\b\003\n\002\020\013\n\002\b\002\n\002\030\002\n\000\032\030\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\003H\000\032H\020\005\032\016\022\n\022\b\022\004\022\002H\b0\0070\006\"\004\b\000\020\b2\f\020\t\032\b\022\004\022\002H\b0\0062\006\020\002\032\0020\0032\006\020\004\032\0020\0032\006\020\n\032\0020\0132\006\020\f\032\0020\013H\000\032D\020\r\032\016\022\n\022\b\022\004\022\002H\b0\0070\016\"\004\b\000\020\b*\b\022\004\022\002H\b0\0162\006\020\002\032\0020\0032\006\020\004\032\0020\0032\006\020\n\032\0020\0132\006\020\f\032\0020\013H\000¨\006\017"}, d2={"checkWindowSizeStep", "", "size", "", "step", "windowedIterator", "", "", "T", "iterator", "partialWindows", "", "reuseBuffer", "windowedSequence", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"})
public final class SlidingWindowKt
{
  public static final void checkWindowSizeStep(int size, int step) {
    int i = (size > 0) && (step > 0) ? 1 : 0; if (i == 0) { int $i$a$1$require; String str = 
      


        "size " + size + " must be greater than zero.";throw ((Throwable)new IllegalArgumentException(str.toString()));
    }
  }
  


  @org.jetbrains.annotations.NotNull
  public static final <T> kotlin.sequences.Sequence<java.util.List<T>> windowedSequence(@org.jetbrains.annotations.NotNull kotlin.sequences.Sequence<? extends T> $receiver, int size, int step, boolean partialWindows, boolean reuseBuffer)
  {
    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");checkWindowSizeStep(size, step);
    return (kotlin.sequences.Sequence)new SlidingWindowKt.windowedSequence..inlined.Sequence.1($receiver, size, step, partialWindows, reuseBuffer);
  }
  
  @org.jetbrains.annotations.NotNull
  public static final <T> Iterator<java.util.List<T>> windowedIterator(@org.jetbrains.annotations.NotNull final Iterator<? extends T> iterator, final int size, int step, final boolean partialWindows, final boolean reuseBuffer) { kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(iterator, "iterator"); if (!iterator.hasNext()) return (Iterator)EmptyIterator.INSTANCE;
    kotlin.sequences.SequencesKt.iterator((kotlin.jvm.functions.Function2)new kotlin.coroutines.jvm.internal.RestrictedSuspendLambda(step, size)
    {
      private kotlin.sequences.SequenceScope p$;
      Object L$0;
      Object L$1;
      Object L$2;
      Object L$3;
      int I$0;
      int I$1;
      int label;
      
      /* Error */
      @org.jetbrains.annotations.Nullable
      public final Object invokeSuspend(@org.jetbrains.annotations.NotNull Object result)
      {
        // Byte code:
        //   0: invokestatic 50	kotlin/coroutines/intrinsics/IntrinsicsKt:getCOROUTINE_SUSPENDED	()Ljava/lang/Object;
        //   3: astore 9
        //   5: aload_0
        //   6: getfield 53	kotlin/collections/SlidingWindowKt$windowedIterator$1:label	I
        //   9: tableswitch	default:+856->865, 0:+39->48, 1:+208->217, 2:+385->394, 3:+560->569, 4:+711->720, 5:+820->829
        //   48: aload_1
        //   49: dup
        //   50: instanceof 55
        //   53: ifeq +10 -> 63
        //   56: checkcast 55	kotlin/Result$Failure
        //   59: getfield 59	kotlin/Result$Failure:exception	Ljava/lang/Throwable;
        //   62: athrow
        //   63: pop
        //   64: aload_0
        //   65: getfield 61	kotlin/collections/SlidingWindowKt$windowedIterator$1:p$	Lkotlin/sequences/SequenceScope;
        //   68: astore_2
        //   69: aload_0
        //   70: getfield 64	kotlin/collections/SlidingWindowKt$windowedIterator$1:$step	I
        //   73: aload_0
        //   74: getfield 67	kotlin/collections/SlidingWindowKt$windowedIterator$1:$size	I
        //   77: isub
        //   78: istore_3
        //   79: iload_3
        //   80: iflt +355 -> 435
        //   83: new 69	java/util/ArrayList
        //   86: dup
        //   87: aload_0
        //   88: getfield 67	kotlin/collections/SlidingWindowKt$windowedIterator$1:$size	I
        //   91: invokespecial 73	java/util/ArrayList:<init>	(I)V
        //   94: astore 4
        //   96: iconst_0
        //   97: istore 5
        //   99: aload_0
        //   100: getfield 77	kotlin/collections/SlidingWindowKt$windowedIterator$1:$iterator	Ljava/util/Iterator;
        //   103: astore 8
        //   105: aload 8
        //   107: astore 7
        //   109: aload 7
        //   111: invokeinterface 83 1 0
        //   116: ifeq +196 -> 312
        //   119: aload 7
        //   121: invokeinterface 86 1 0
        //   126: astore 6
        //   128: iload 5
        //   130: ifle +12 -> 142
        //   133: iload 5
        //   135: iconst_1
        //   136: isub
        //   137: istore 5
        //   139: goto +170 -> 309
        //   142: aload 4
        //   144: aload 6
        //   146: invokevirtual 90	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   149: pop
        //   150: aload 4
        //   152: invokevirtual 94	java/util/ArrayList:size	()I
        //   155: aload_0
        //   156: getfield 67	kotlin/collections/SlidingWindowKt$windowedIterator$1:$size	I
        //   159: if_icmpne +150 -> 309
        //   162: aload_2
        //   163: aload 4
        //   165: aload_0
        //   166: aload_0
        //   167: aload_2
        //   168: putfield 96	kotlin/collections/SlidingWindowKt$windowedIterator$1:L$0	Ljava/lang/Object;
        //   171: aload_0
        //   172: iload_3
        //   173: putfield 98	kotlin/collections/SlidingWindowKt$windowedIterator$1:I$0	I
        //   176: aload_0
        //   177: aload 4
        //   179: putfield 100	kotlin/collections/SlidingWindowKt$windowedIterator$1:L$1	Ljava/lang/Object;
        //   182: aload_0
        //   183: iload 5
        //   185: putfield 102	kotlin/collections/SlidingWindowKt$windowedIterator$1:I$1	I
        //   188: aload_0
        //   189: aload 6
        //   191: putfield 104	kotlin/collections/SlidingWindowKt$windowedIterator$1:L$2	Ljava/lang/Object;
        //   194: aload_0
        //   195: aload 7
        //   197: putfield 106	kotlin/collections/SlidingWindowKt$windowedIterator$1:L$3	Ljava/lang/Object;
        //   200: aload_0
        //   201: iconst_1
        //   202: putfield 53	kotlin/collections/SlidingWindowKt$windowedIterator$1:label	I
        //   205: invokevirtual 112	kotlin/sequences/SequenceScope:yield	(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        //   208: dup
        //   209: aload 9
        //   211: if_acmpne +66 -> 277
        //   214: aload 9
        //   216: areturn
        //   217: aload_0
        //   218: getfield 106	kotlin/collections/SlidingWindowKt$windowedIterator$1:L$3	Ljava/lang/Object;
        //   221: checkcast 79	java/util/Iterator
        //   224: astore 7
        //   226: aload_0
        //   227: getfield 104	kotlin/collections/SlidingWindowKt$windowedIterator$1:L$2	Ljava/lang/Object;
        //   230: astore 6
        //   232: aload_0
        //   233: getfield 102	kotlin/collections/SlidingWindowKt$windowedIterator$1:I$1	I
        //   236: istore 5
        //   238: aload_0
        //   239: getfield 100	kotlin/collections/SlidingWindowKt$windowedIterator$1:L$1	Ljava/lang/Object;
        //   242: checkcast 69	java/util/ArrayList
        //   245: astore 4
        //   247: aload_0
        //   248: getfield 98	kotlin/collections/SlidingWindowKt$windowedIterator$1:I$0	I
        //   251: istore_3
        //   252: aload_0
        //   253: getfield 96	kotlin/collections/SlidingWindowKt$windowedIterator$1:L$0	Ljava/lang/Object;
        //   256: checkcast 108	kotlin/sequences/SequenceScope
        //   259: astore_2
        //   260: aload_1
        //   261: dup
        //   262: instanceof 55
        //   265: ifeq +10 -> 275
        //   268: checkcast 55	kotlin/Result$Failure
        //   271: getfield 59	kotlin/Result$Failure:exception	Ljava/lang/Throwable;
        //   274: athrow
        //   275: pop
        //   276: aload_1
        //   277: pop
        //   278: aload_0
        //   279: getfield 116	kotlin/collections/SlidingWindowKt$windowedIterator$1:$reuseBuffer	Z
        //   282: ifeq +11 -> 293
        //   285: aload 4
        //   287: invokevirtual 120	java/util/ArrayList:clear	()V
        //   290: goto +16 -> 306
        //   293: new 69	java/util/ArrayList
        //   296: dup
        //   297: aload_0
        //   298: getfield 67	kotlin/collections/SlidingWindowKt$windowedIterator$1:$size	I
        //   301: invokespecial 73	java/util/ArrayList:<init>	(I)V
        //   304: astore 4
        //   306: iload_3
        //   307: istore 5
        //   309: goto -200 -> 109
        //   312: aload 4
        //   314: checkcast 122	java/util/Collection
        //   317: astore 6
        //   319: aload 6
        //   321: invokeinterface 125 1 0
        //   326: ifne +7 -> 333
        //   329: iconst_1
        //   330: goto +4 -> 334
        //   333: iconst_0
        //   334: ifeq +527 -> 861
        //   337: aload_0
        //   338: getfield 128	kotlin/collections/SlidingWindowKt$windowedIterator$1:$partialWindows	Z
        //   341: ifne +15 -> 356
        //   344: aload 4
        //   346: invokevirtual 94	java/util/ArrayList:size	()I
        //   349: aload_0
        //   350: getfield 67	kotlin/collections/SlidingWindowKt$windowedIterator$1:$size	I
        //   353: if_icmpne +508 -> 861
        //   356: aload_2
        //   357: aload 4
        //   359: aload_0
        //   360: aload_0
        //   361: iload_3
        //   362: putfield 98	kotlin/collections/SlidingWindowKt$windowedIterator$1:I$0	I
        //   365: aload_0
        //   366: aload 4
        //   368: putfield 96	kotlin/collections/SlidingWindowKt$windowedIterator$1:L$0	Ljava/lang/Object;
        //   371: aload_0
        //   372: iload 5
        //   374: putfield 102	kotlin/collections/SlidingWindowKt$windowedIterator$1:I$1	I
        //   377: aload_0
        //   378: iconst_2
        //   379: putfield 53	kotlin/collections/SlidingWindowKt$windowedIterator$1:label	I
        //   382: invokevirtual 112	kotlin/sequences/SequenceScope:yield	(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        //   385: dup
        //   386: aload 9
        //   388: if_acmpne +43 -> 431
        //   391: aload 9
        //   393: areturn
        //   394: aload_0
        //   395: getfield 102	kotlin/collections/SlidingWindowKt$windowedIterator$1:I$1	I
        //   398: istore 5
        //   400: aload_0
        //   401: getfield 96	kotlin/collections/SlidingWindowKt$windowedIterator$1:L$0	Ljava/lang/Object;
        //   404: checkcast 69	java/util/ArrayList
        //   407: astore 4
        //   409: aload_0
        //   410: getfield 98	kotlin/collections/SlidingWindowKt$windowedIterator$1:I$0	I
        //   413: istore_3
        //   414: aload_1
        //   415: dup
        //   416: instanceof 55
        //   419: ifeq +10 -> 429
        //   422: checkcast 55	kotlin/Result$Failure
        //   425: getfield 59	kotlin/Result$Failure:exception	Ljava/lang/Throwable;
        //   428: athrow
        //   429: pop
        //   430: aload_1
        //   431: pop
        //   432: goto +429 -> 861
        //   435: new 130	kotlin/collections/RingBuffer
        //   438: dup
        //   439: aload_0
        //   440: getfield 67	kotlin/collections/SlidingWindowKt$windowedIterator$1:$size	I
        //   443: invokespecial 131	kotlin/collections/RingBuffer:<init>	(I)V
        //   446: astore 4
        //   448: aload_0
        //   449: getfield 77	kotlin/collections/SlidingWindowKt$windowedIterator$1:$iterator	Ljava/util/Iterator;
        //   452: astore 7
        //   454: aload 7
        //   456: astore 6
        //   458: aload 6
        //   460: invokeinterface 83 1 0
        //   465: ifeq +171 -> 636
        //   468: aload 6
        //   470: invokeinterface 86 1 0
        //   475: astore 5
        //   477: aload 4
        //   479: aload 5
        //   481: invokevirtual 134	kotlin/collections/RingBuffer:add	(Ljava/lang/Object;)V
        //   484: aload 4
        //   486: invokevirtual 137	kotlin/collections/RingBuffer:isFull	()Z
        //   489: ifeq +144 -> 633
        //   492: aload_2
        //   493: aload_0
        //   494: getfield 116	kotlin/collections/SlidingWindowKt$windowedIterator$1:$reuseBuffer	Z
        //   497: ifeq +11 -> 508
        //   500: aload 4
        //   502: checkcast 139	java/util/List
        //   505: goto +18 -> 523
        //   508: new 69	java/util/ArrayList
        //   511: dup
        //   512: aload 4
        //   514: checkcast 122	java/util/Collection
        //   517: invokespecial 142	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
        //   520: checkcast 139	java/util/List
        //   523: aload_0
        //   524: aload_0
        //   525: aload_2
        //   526: putfield 96	kotlin/collections/SlidingWindowKt$windowedIterator$1:L$0	Ljava/lang/Object;
        //   529: aload_0
        //   530: iload_3
        //   531: putfield 98	kotlin/collections/SlidingWindowKt$windowedIterator$1:I$0	I
        //   534: aload_0
        //   535: aload 4
        //   537: putfield 100	kotlin/collections/SlidingWindowKt$windowedIterator$1:L$1	Ljava/lang/Object;
        //   540: aload_0
        //   541: aload 5
        //   543: putfield 104	kotlin/collections/SlidingWindowKt$windowedIterator$1:L$2	Ljava/lang/Object;
        //   546: aload_0
        //   547: aload 6
        //   549: putfield 106	kotlin/collections/SlidingWindowKt$windowedIterator$1:L$3	Ljava/lang/Object;
        //   552: aload_0
        //   553: iconst_3
        //   554: putfield 53	kotlin/collections/SlidingWindowKt$windowedIterator$1:label	I
        //   557: invokevirtual 112	kotlin/sequences/SequenceScope:yield	(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        //   560: dup
        //   561: aload 9
        //   563: if_acmpne +60 -> 623
        //   566: aload 9
        //   568: areturn
        //   569: aload_0
        //   570: getfield 106	kotlin/collections/SlidingWindowKt$windowedIterator$1:L$3	Ljava/lang/Object;
        //   573: checkcast 79	java/util/Iterator
        //   576: astore 6
        //   578: aload_0
        //   579: getfield 104	kotlin/collections/SlidingWindowKt$windowedIterator$1:L$2	Ljava/lang/Object;
        //   582: astore 5
        //   584: aload_0
        //   585: getfield 100	kotlin/collections/SlidingWindowKt$windowedIterator$1:L$1	Ljava/lang/Object;
        //   588: checkcast 130	kotlin/collections/RingBuffer
        //   591: astore 4
        //   593: aload_0
        //   594: getfield 98	kotlin/collections/SlidingWindowKt$windowedIterator$1:I$0	I
        //   597: istore_3
        //   598: aload_0
        //   599: getfield 96	kotlin/collections/SlidingWindowKt$windowedIterator$1:L$0	Ljava/lang/Object;
        //   602: checkcast 108	kotlin/sequences/SequenceScope
        //   605: astore_2
        //   606: aload_1
        //   607: dup
        //   608: instanceof 55
        //   611: ifeq +10 -> 621
        //   614: checkcast 55	kotlin/Result$Failure
        //   617: getfield 59	kotlin/Result$Failure:exception	Ljava/lang/Throwable;
        //   620: athrow
        //   621: pop
        //   622: aload_1
        //   623: pop
        //   624: aload 4
        //   626: aload_0
        //   627: getfield 64	kotlin/collections/SlidingWindowKt$windowedIterator$1:$step	I
        //   630: invokevirtual 145	kotlin/collections/RingBuffer:removeFirst	(I)V
        //   633: goto -175 -> 458
        //   636: aload_0
        //   637: getfield 128	kotlin/collections/SlidingWindowKt$windowedIterator$1:$partialWindows	Z
        //   640: ifeq +221 -> 861
        //   643: aload 4
        //   645: invokevirtual 146	kotlin/collections/RingBuffer:size	()I
        //   648: aload_0
        //   649: getfield 64	kotlin/collections/SlidingWindowKt$windowedIterator$1:$step	I
        //   652: if_icmple +120 -> 772
        //   655: aload_2
        //   656: aload_0
        //   657: getfield 116	kotlin/collections/SlidingWindowKt$windowedIterator$1:$reuseBuffer	Z
        //   660: ifeq +11 -> 671
        //   663: aload 4
        //   665: checkcast 139	java/util/List
        //   668: goto +18 -> 686
        //   671: new 69	java/util/ArrayList
        //   674: dup
        //   675: aload 4
        //   677: checkcast 122	java/util/Collection
        //   680: invokespecial 142	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
        //   683: checkcast 139	java/util/List
        //   686: aload_0
        //   687: aload_0
        //   688: aload_2
        //   689: putfield 96	kotlin/collections/SlidingWindowKt$windowedIterator$1:L$0	Ljava/lang/Object;
        //   692: aload_0
        //   693: iload_3
        //   694: putfield 98	kotlin/collections/SlidingWindowKt$windowedIterator$1:I$0	I
        //   697: aload_0
        //   698: aload 4
        //   700: putfield 100	kotlin/collections/SlidingWindowKt$windowedIterator$1:L$1	Ljava/lang/Object;
        //   703: aload_0
        //   704: iconst_4
        //   705: putfield 53	kotlin/collections/SlidingWindowKt$windowedIterator$1:label	I
        //   708: invokevirtual 112	kotlin/sequences/SequenceScope:yield	(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        //   711: dup
        //   712: aload 9
        //   714: if_acmpne +45 -> 759
        //   717: aload 9
        //   719: areturn
        //   720: aload_0
        //   721: getfield 100	kotlin/collections/SlidingWindowKt$windowedIterator$1:L$1	Ljava/lang/Object;
        //   724: checkcast 130	kotlin/collections/RingBuffer
        //   727: astore 4
        //   729: aload_0
        //   730: getfield 98	kotlin/collections/SlidingWindowKt$windowedIterator$1:I$0	I
        //   733: istore_3
        //   734: aload_0
        //   735: getfield 96	kotlin/collections/SlidingWindowKt$windowedIterator$1:L$0	Ljava/lang/Object;
        //   738: checkcast 108	kotlin/sequences/SequenceScope
        //   741: astore_2
        //   742: aload_1
        //   743: dup
        //   744: instanceof 55
        //   747: ifeq +10 -> 757
        //   750: checkcast 55	kotlin/Result$Failure
        //   753: getfield 59	kotlin/Result$Failure:exception	Ljava/lang/Throwable;
        //   756: athrow
        //   757: pop
        //   758: aload_1
        //   759: pop
        //   760: aload 4
        //   762: aload_0
        //   763: getfield 64	kotlin/collections/SlidingWindowKt$windowedIterator$1:$step	I
        //   766: invokevirtual 145	kotlin/collections/RingBuffer:removeFirst	(I)V
        //   769: goto -126 -> 643
        //   772: aload 4
        //   774: checkcast 122	java/util/Collection
        //   777: astore 5
        //   779: aload 5
        //   781: invokeinterface 125 1 0
        //   786: ifne +7 -> 793
        //   789: iconst_1
        //   790: goto +4 -> 794
        //   793: iconst_0
        //   794: ifeq +67 -> 861
        //   797: aload_2
        //   798: aload 4
        //   800: aload_0
        //   801: aload_0
        //   802: iload_3
        //   803: putfield 98	kotlin/collections/SlidingWindowKt$windowedIterator$1:I$0	I
        //   806: aload_0
        //   807: aload 4
        //   809: putfield 96	kotlin/collections/SlidingWindowKt$windowedIterator$1:L$0	Ljava/lang/Object;
        //   812: aload_0
        //   813: iconst_5
        //   814: putfield 53	kotlin/collections/SlidingWindowKt$windowedIterator$1:label	I
        //   817: invokevirtual 112	kotlin/sequences/SequenceScope:yield	(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        //   820: dup
        //   821: aload 9
        //   823: if_acmpne +37 -> 860
        //   826: aload 9
        //   828: areturn
        //   829: aload_0
        //   830: getfield 96	kotlin/collections/SlidingWindowKt$windowedIterator$1:L$0	Ljava/lang/Object;
        //   833: checkcast 130	kotlin/collections/RingBuffer
        //   836: astore 4
        //   838: aload_0
        //   839: getfield 98	kotlin/collections/SlidingWindowKt$windowedIterator$1:I$0	I
        //   842: istore_3
        //   843: aload_1
        //   844: dup
        //   845: instanceof 55
        //   848: ifeq +10 -> 858
        //   851: checkcast 55	kotlin/Result$Failure
        //   854: getfield 59	kotlin/Result$Failure:exception	Ljava/lang/Throwable;
        //   857: athrow
        //   858: pop
        //   859: aload_1
        //   860: pop
        //   861: getstatic 152	kotlin/Unit:INSTANCE	Lkotlin/Unit;
        //   864: areturn
        //   865: new 154	java/lang/IllegalStateException
        //   868: dup
        //   869: ldc -100
        //   871: invokespecial 159	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
        //   874: athrow
        // Line number table:
        //   Java source line #24	-> byte code offset #3
        //   Java source line #25	-> byte code offset #69
        //   Java source line #26	-> byte code offset #79
        //   Java source line #27	-> byte code offset #83
        //   Java source line #28	-> byte code offset #96
        //   Java source line #29	-> byte code offset #99
        //   Java source line #30	-> byte code offset #128
        //   Java source line #31	-> byte code offset #142
        //   Java source line #32	-> byte code offset #150
        //   Java source line #33	-> byte code offset #162
        //   Java source line #24	-> byte code offset #214
        //   Java source line #34	-> byte code offset #277
        //   Java source line #35	-> byte code offset #306
        //   Java source line #29	-> byte code offset #309
        //   Java source line #38	-> byte code offset #312
        //   Java source line #39	-> byte code offset #337
        //   Java source line #24	-> byte code offset #391
        //   Java source line #42	-> byte code offset #431
        //   Java source line #43	-> byte code offset #448
        //   Java source line #44	-> byte code offset #477
        //   Java source line #45	-> byte code offset #484
        //   Java source line #46	-> byte code offset #492
        //   Java source line #24	-> byte code offset #566
        //   Java source line #47	-> byte code offset #623
        //   Java source line #43	-> byte code offset #633
        //   Java source line #50	-> byte code offset #636
        //   Java source line #51	-> byte code offset #643
        //   Java source line #52	-> byte code offset #655
        //   Java source line #24	-> byte code offset #717
        //   Java source line #53	-> byte code offset #759
        //   Java source line #51	-> byte code offset #769
        //   Java source line #55	-> byte code offset #772
        //   Java source line #55	-> byte code offset #797
        //   Java source line #24	-> byte code offset #826
        //   Java source line #57	-> byte code offset #860
        //   Java source line #58	-> byte code offset #861
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	875	0	this	1
        //   0	875	1	result	Object
        //   79	782	3	gap	int
        //   96	336	4	buffer	java.util.ArrayList
        //   448	413	4	buffer	RingBuffer
        //   99	333	5	skip	int
        //   477	156	5	e	Object
        //   128	181	6	e	Object
      }
      
      @org.jetbrains.annotations.NotNull
      public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable Object value, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> completion)
      {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(completion, "completion");
        1 local1 = new 1($step, size, iterator, reuseBuffer, partialWindows, completion);
        p$ = ((kotlin.sequences.SequenceScope)value);
        return local1;
      }
      
      public final Object invoke(Object paramAnonymousObject1, Object paramAnonymousObject2)
      {
        return ((1)create(paramAnonymousObject1, (kotlin.coroutines.Continuation)paramAnonymousObject2)).invokeSuspend(kotlin.Unit.INSTANCE);
      }
    });
  }
}
