/* Generated By:JJTree&JavaCC: Do not edit this line. Parser.java */
package haiyan.exp;
@SuppressWarnings({
  "all"
})
public class Parser/*@bgen(jjtree)*/implements ParserTreeConstants, ParserConstants {/*@bgen(jjtree)*/
  protected JJTParserState jjtree = new JJTParserState();

  final public SimpleNode Start() throws ParseException {
                         /*@bgen(jjtree) Root */
  CTreeRoot jjtn000 = new CTreeRoot(JJTROOT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      Expression();
      jj_consume_token(0);
                     jjtree.closeNodeScope(jjtn000, true);
                     jjtc000 = false;
    {if (true) return jjtn000;}
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
    throw new Error("Missing return statement in function");
  }

  final public void Expression() throws ParseException {
    ComparisonOpExpression();
  }

  final public void ComparisonOpExpression() throws ParseException {
    StringConcatExpression();
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 28:
      case 29:
      case 30:
      case 31:
      case 32:
      case 33:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
                             CTreeBinOp jjtn001 = new CTreeBinOp(JJTBINOP);
                             boolean jjtc001 = true;
                             jjtree.openNodeScope(jjtn001);
      try {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 28:
          jj_consume_token(28);
          break;
        case 29:
          jj_consume_token(29);
          break;
        case 30:
          jj_consume_token(30);
          break;
        case 31:
          jj_consume_token(31);
          break;
        case 32:
          jj_consume_token(32);
          break;
        case 33:
          jj_consume_token(33);
          break;
        default:
          jj_la1[1] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
    jjtn001.setText(getToken(0).image);
        StringConcatExpression();
      } catch (Throwable jjte001) {
                             if (jjtc001) {
                               jjtree.clearNodeScope(jjtn001);
                               jjtc001 = false;
                             } else {
                               jjtree.popNode();
                             }
                             if (jjte001 instanceof RuntimeException) {
                               {if (true) throw (RuntimeException)jjte001;}
                             }
                             if (jjte001 instanceof ParseException) {
                               {if (true) throw (ParseException)jjte001;}
                             }
                             {if (true) throw (Error)jjte001;}
      } finally {
                             if (jjtc001) {
                               jjtree.closeNodeScope(jjtn001,  2);
                             }
      }
    }
  }

  final public void StringConcatExpression() throws ParseException {
    AdditiveExpression();
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 34:
        ;
        break;
      default:
        jj_la1[2] = jj_gen;
        break label_2;
      }
                         CTreeBinOp jjtn001 = new CTreeBinOp(JJTBINOP);
                         boolean jjtc001 = true;
                         jjtree.openNodeScope(jjtn001);
      try {
        jj_consume_token(34);
    jjtn001.setText(getToken(0).image);
        AdditiveExpression();
      } catch (Throwable jjte001) {
                         if (jjtc001) {
                           jjtree.clearNodeScope(jjtn001);
                           jjtc001 = false;
                         } else {
                           jjtree.popNode();
                         }
                         if (jjte001 instanceof RuntimeException) {
                           {if (true) throw (RuntimeException)jjte001;}
                         }
                         if (jjte001 instanceof ParseException) {
                           {if (true) throw (ParseException)jjte001;}
                         }
                         {if (true) throw (Error)jjte001;}
      } finally {
                         if (jjtc001) {
                           jjtree.closeNodeScope(jjtn001,  2);
                         }
      }
    }
  }

  final public void AdditiveExpression() throws ParseException {
    MultiplicativeExpression();
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 35:
      case 36:
        ;
        break;
      default:
        jj_la1[3] = jj_gen;
        break label_3;
      }
                               CTreeBinOp jjtn001 = new CTreeBinOp(JJTBINOP);
                               boolean jjtc001 = true;
                               jjtree.openNodeScope(jjtn001);
      try {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 35:
          jj_consume_token(35);
          break;
        case 36:
          jj_consume_token(36);
          break;
        default:
          jj_la1[4] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
    jjtn001.setText(getToken(0).image);
        MultiplicativeExpression();
      } catch (Throwable jjte001) {
                               if (jjtc001) {
                                 jjtree.clearNodeScope(jjtn001);
                                 jjtc001 = false;
                               } else {
                                 jjtree.popNode();
                               }
                               if (jjte001 instanceof RuntimeException) {
                                 {if (true) throw (RuntimeException)jjte001;}
                               }
                               if (jjte001 instanceof ParseException) {
                                 {if (true) throw (ParseException)jjte001;}
                               }
                               {if (true) throw (Error)jjte001;}
      } finally {
                               if (jjtc001) {
                                 jjtree.closeNodeScope(jjtn001,  2);
                               }
      }
    }
  }

  final public void MultiplicativeExpression() throws ParseException {
    ExpoExpression();
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 37:
      case 38:
        ;
        break;
      default:
        jj_la1[5] = jj_gen;
        break label_4;
      }
                     CTreeBinOp jjtn001 = new CTreeBinOp(JJTBINOP);
                     boolean jjtc001 = true;
                     jjtree.openNodeScope(jjtn001);
      try {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 37:
          jj_consume_token(37);
          break;
        case 38:
          jj_consume_token(38);
          break;
        default:
          jj_la1[6] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
    jjtn001.setText(getToken(0).image);
        ExpoExpression();
      } catch (Throwable jjte001) {
                     if (jjtc001) {
                       jjtree.clearNodeScope(jjtn001);
                       jjtc001 = false;
                     } else {
                       jjtree.popNode();
                     }
                     if (jjte001 instanceof RuntimeException) {
                       {if (true) throw (RuntimeException)jjte001;}
                     }
                     if (jjte001 instanceof ParseException) {
                       {if (true) throw (ParseException)jjte001;}
                     }
                     {if (true) throw (Error)jjte001;}
      } finally {
                     if (jjtc001) {
                       jjtree.closeNodeScope(jjtn001,  2);
                     }
      }
    }
  }

  final public void ExpoExpression() throws ParseException {
    PlusExpression();
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 39:
        ;
        break;
      default:
        jj_la1[7] = jj_gen;
        break label_5;
      }
                     CTreeBinOp jjtn001 = new CTreeBinOp(JJTBINOP);
                     boolean jjtc001 = true;
                     jjtree.openNodeScope(jjtn001);
      try {
        jj_consume_token(39);
    jjtn001.setText(getToken(0).image);
        PlusExpression();
      } catch (Throwable jjte001) {
                     if (jjtc001) {
                       jjtree.clearNodeScope(jjtn001);
                       jjtc001 = false;
                     } else {
                       jjtree.popNode();
                     }
                     if (jjte001 instanceof RuntimeException) {
                       {if (true) throw (RuntimeException)jjte001;}
                     }
                     if (jjte001 instanceof ParseException) {
                       {if (true) throw (ParseException)jjte001;}
                     }
                     {if (true) throw (Error)jjte001;}
      } finally {
                     if (jjtc001) {
                       jjtree.closeNodeScope(jjtn001,  2);
                     }
      }
    }
  }

  final public void PlusExpression() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 35:
    case 36:
    CTreeBinOp jjtn001 = new CTreeBinOp(JJTBINOP);
    boolean jjtc001 = true;
    jjtree.openNodeScope(jjtn001);
      try {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 35:
          jj_consume_token(35);
          break;
        case 36:
          jj_consume_token(36);
          break;
        default:
          jj_la1[8] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
    jjtn001.setText(getToken(0).image);
        UnaryExpression();
      } catch (Throwable jjte001) {
    if (jjtc001) {
      jjtree.clearNodeScope(jjtn001);
      jjtc001 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte001 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte001;}
    }
    if (jjte001 instanceof ParseException) {
      {if (true) throw (ParseException)jjte001;}
    }
    {if (true) throw (Error)jjte001;}
      } finally {
    if (jjtc001) {
      jjtree.closeNodeScope(jjtn001,  1);
    }
      }
      break;
    case NUMERIC_LITERAL:
    case BOOLEAN_LITERAL:
    case NULL_LITERAL:
    case FUNSHORTCIRCUIT:
    case FUNFIXED:
    case IDENTIFIER:
    case STRING_LITERAL:
    case 40:
      UnaryExpression();
      break;
    default:
      jj_la1[9] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void UnaryExpression() throws ParseException {
    if (jj_2_1(2)) {
              CTreeFunShortCircuit jjtn001 = new CTreeFunShortCircuit(JJTFUNSHORTCIRCUIT);
              boolean jjtc001 = true;
              jjtree.openNodeScope(jjtn001);
      try {
        jj_consume_token(FUNSHORTCIRCUIT);
    jjtn001.setText(getToken(0).image);
        jj_consume_token(40);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 41:
          jj_consume_token(41);
          break;
        case NUMERIC_LITERAL:
        case BOOLEAN_LITERAL:
        case NULL_LITERAL:
        case FUNSHORTCIRCUIT:
        case FUNFIXED:
        case IDENTIFIER:
        case STRING_LITERAL:
        case 35:
        case 36:
        case 40:
        case 42:
          InnerFunParaList();
          break;
        default:
          jj_la1[10] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      } catch (Throwable jjte001) {
              if (jjtc001) {
                jjtree.clearNodeScope(jjtn001);
                jjtc001 = false;
              } else {
                jjtree.popNode();
              }
              if (jjte001 instanceof RuntimeException) {
                {if (true) throw (RuntimeException)jjte001;}
              }
              if (jjte001 instanceof ParseException) {
                {if (true) throw (ParseException)jjte001;}
              }
              {if (true) throw (Error)jjte001;}
      } finally {
              if (jjtc001) {
                jjtree.closeNodeScope(jjtn001, true);
              }
      }
    } else if (jj_2_2(2)) {
              CTreeFunFixed jjtn002 = new CTreeFunFixed(JJTFUNFIXED);
              boolean jjtc002 = true;
              jjtree.openNodeScope(jjtn002);
      try {
        jj_consume_token(FUNFIXED);
    jjtn002.setText(getToken(0).image);
        jj_consume_token(40);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 41:
          jj_consume_token(41);
          break;
        case NUMERIC_LITERAL:
        case BOOLEAN_LITERAL:
        case NULL_LITERAL:
        case FUNSHORTCIRCUIT:
        case FUNFIXED:
        case IDENTIFIER:
        case STRING_LITERAL:
        case 35:
        case 36:
        case 40:
        case 42:
          InnerFunParaList();
          break;
        default:
          jj_la1[11] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      } catch (Throwable jjte002) {
              if (jjtc002) {
                jjtree.clearNodeScope(jjtn002);
                jjtc002 = false;
              } else {
                jjtree.popNode();
              }
              if (jjte002 instanceof RuntimeException) {
                {if (true) throw (RuntimeException)jjte002;}
              }
              if (jjte002 instanceof ParseException) {
                {if (true) throw (ParseException)jjte002;}
              }
              {if (true) throw (Error)jjte002;}
      } finally {
              if (jjtc002) {
                jjtree.closeNodeScope(jjtn002, true);
              }
      }
    } else if (jj_2_3(2)) {
              CTreeFunOp jjtn003 = new CTreeFunOp(JJTFUNOP);
              boolean jjtc003 = true;
              jjtree.openNodeScope(jjtn003);
      try {
        jj_consume_token(IDENTIFIER);
    jjtn003.setText(getToken(0).image);
        jj_consume_token(40);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 41:
          jj_consume_token(41);
          break;
        case NUMERIC_LITERAL:
        case BOOLEAN_LITERAL:
        case NULL_LITERAL:
        case FUNSHORTCIRCUIT:
        case FUNFIXED:
        case IDENTIFIER:
        case STRING_LITERAL:
        case 35:
        case 36:
        case 40:
        case 42:
          FunOpParaList();
          break;
        default:
          jj_la1[12] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      } catch (Throwable jjte003) {
              if (jjtc003) {
                jjtree.clearNodeScope(jjtn003);
                jjtc003 = false;
              } else {
                jjtree.popNode();
              }
              if (jjte003 instanceof RuntimeException) {
                {if (true) throw (RuntimeException)jjte003;}
              }
              if (jjte003 instanceof ParseException) {
                {if (true) throw (ParseException)jjte003;}
              }
              {if (true) throw (Error)jjte003;}
      } finally {
              if (jjtc003) {
                jjtree.closeNodeScope(jjtn003, true);
              }
      }
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 40:
        jj_consume_token(40);
        Expression();
        jj_consume_token(41);
        break;
      case BOOLEAN_LITERAL:
                  CTreeBoolConstrant jjtn004 = new CTreeBoolConstrant(JJTBOOLCONSTRANT);
                  boolean jjtc004 = true;
                  jjtree.openNodeScope(jjtn004);
        try {
          jj_consume_token(BOOLEAN_LITERAL);
                                    jjtree.closeNodeScope(jjtn004, true);
                                    jjtc004 = false;
    jjtn004.setText(getToken(0).image);
        } finally {
                  if (jjtc004) {
                    jjtree.closeNodeScope(jjtn004, true);
                  }
        }
        break;
      case NULL_LITERAL:
                  CTreeNullConstrant jjtn005 = new CTreeNullConstrant(JJTNULLCONSTRANT);
                  boolean jjtc005 = true;
                  jjtree.openNodeScope(jjtn005);
        try {
          jj_consume_token(NULL_LITERAL);
                                 jjtree.closeNodeScope(jjtn005, true);
                                 jjtc005 = false;
    jjtn005.setText(getToken(0).image);
        } finally {
                  if (jjtc005) {
                    jjtree.closeNodeScope(jjtn005, true);
                  }
        }
        break;
      case FUNSHORTCIRCUIT:
                  CTreeVar jjtn006 = new CTreeVar(JJTVAR);
                  boolean jjtc006 = true;
                  jjtree.openNodeScope(jjtn006);
        try {
          jj_consume_token(FUNSHORTCIRCUIT);
                                    jjtree.closeNodeScope(jjtn006, true);
                                    jjtc006 = false;
    jjtn006.setText(getToken(0).image);
        } finally {
                  if (jjtc006) {
                    jjtree.closeNodeScope(jjtn006, true);
                  }
        }
        break;
      case FUNFIXED:
                  CTreeVar jjtn007 = new CTreeVar(JJTVAR);
                  boolean jjtc007 = true;
                  jjtree.openNodeScope(jjtn007);
        try {
          jj_consume_token(FUNFIXED);
                             jjtree.closeNodeScope(jjtn007, true);
                             jjtc007 = false;
    jjtn007.setText(getToken(0).image);
        } finally {
                  if (jjtc007) {
                    jjtree.closeNodeScope(jjtn007, true);
                  }
        }
        break;
      case IDENTIFIER:
                  CTreeVar jjtn008 = new CTreeVar(JJTVAR);
                  boolean jjtc008 = true;
                  jjtree.openNodeScope(jjtn008);
        try {
          jj_consume_token(IDENTIFIER);
                               jjtree.closeNodeScope(jjtn008, true);
                               jjtc008 = false;
    jjtn008.setText(getToken(0).image);
        } finally {
                  if (jjtc008) {
                    jjtree.closeNodeScope(jjtn008, true);
                  }
        }
        break;
      case NUMERIC_LITERAL:
                  CTreeNumConstrant jjtn009 = new CTreeNumConstrant(JJTNUMCONSTRANT);
                  boolean jjtc009 = true;
                  jjtree.openNodeScope(jjtn009);
        try {
          jj_consume_token(NUMERIC_LITERAL);
                                    jjtree.closeNodeScope(jjtn009, true);
                                    jjtc009 = false;
    jjtn009.setText(getToken(0).image);
        } finally {
                  if (jjtc009) {
                    jjtree.closeNodeScope(jjtn009, true);
                  }
        }
        break;
      case STRING_LITERAL:
                  CTreeStrConstant jjtn010 = new CTreeStrConstant(JJTSTRCONSTANT);
                  boolean jjtc010 = true;
                  jjtree.openNodeScope(jjtn010);
        try {
          jj_consume_token(STRING_LITERAL);
                                   jjtree.closeNodeScope(jjtn010, true);
                                   jjtc010 = false;
    // 这里将常量的左右边的"号去了程序处理方便
String s = getToken(0).image;
    jjtn010.setText(s.substring(1, s.length()-1));
        } finally {
                  if (jjtc010) {
                    jjtree.closeNodeScope(jjtn010, true);
                  }
        }
        break;
      default:
        jj_la1[13] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  final public void FunOpParaList() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 42:
  CTreeStrConstant jjtn001 = new CTreeStrConstant(JJTSTRCONSTANT);
  boolean jjtc001 = true;
  jjtree.openNodeScope(jjtn001);
      try {
        jj_consume_token(42);
      jjtree.closeNodeScope(jjtn001, true);
      jjtc001 = false;
    jjtn001.setText("");
      } finally {
  if (jjtc001) {
    jjtree.closeNodeScope(jjtn001, true);
  }
      }
      FunOpParaList();
      break;
    case 41:
      CTreeStrConstant jjtn002 = new CTreeStrConstant(JJTSTRCONSTANT);
      boolean jjtc002 = true;
      jjtree.openNodeScope(jjtn002);
      try {
        jj_consume_token(41);
          jjtree.closeNodeScope(jjtn002, true);
          jjtc002 = false;
    jjtn002.setText("");
      } finally {
      if (jjtc002) {
        jjtree.closeNodeScope(jjtn002, true);
      }
      }
      break;
    default:
      jj_la1[15] = jj_gen;
      if (jj_2_4(2)) {
        FunOpLastPara();
      } else if (jj_2_5(2)) {
        FunOpNotLastPara();
        FunOpParaList();
      } else {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case NUMERIC_LITERAL:
        case BOOLEAN_LITERAL:
        case NULL_LITERAL:
        case FUNSHORTCIRCUIT:
        case FUNFIXED:
        case IDENTIFIER:
        case STRING_LITERAL:
        case 35:
        case 36:
        case 40:
          Expression();
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case 41:
            jj_consume_token(41);
            break;
          case 42:
            jj_consume_token(42);
            FunOpParaList();
            break;
          default:
            jj_la1[14] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
          break;
        default:
          jj_la1[16] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    }
  }

  final public void InnerFunParaList() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 42:
  CTreeStrConstant jjtn001 = new CTreeStrConstant(JJTSTRCONSTANT);
  boolean jjtc001 = true;
  jjtree.openNodeScope(jjtn001);
      try {
        jj_consume_token(42);
      jjtree.closeNodeScope(jjtn001, true);
      jjtc001 = false;
    jjtn001.setText("");
      } finally {
  if (jjtc001) {
    jjtree.closeNodeScope(jjtn001, true);
  }
      }
      InnerFunParaList();
      break;
    case 41:
      CTreeStrConstant jjtn002 = new CTreeStrConstant(JJTSTRCONSTANT);
      boolean jjtc002 = true;
      jjtree.openNodeScope(jjtn002);
      try {
        jj_consume_token(41);
          jjtree.closeNodeScope(jjtn002, true);
          jjtc002 = false;
    jjtn002.setText("");
      } finally {
      if (jjtc002) {
        jjtree.closeNodeScope(jjtn002, true);
      }
      }
      break;
    case NUMERIC_LITERAL:
    case BOOLEAN_LITERAL:
    case NULL_LITERAL:
    case FUNSHORTCIRCUIT:
    case FUNFIXED:
    case IDENTIFIER:
    case STRING_LITERAL:
    case 35:
    case 36:
    case 40:
      Expression();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 41:
        jj_consume_token(41);
        break;
      case 42:
        jj_consume_token(42);
        InnerFunParaList();
        break;
      default:
        jj_la1[17] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    default:
      jj_la1[18] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void FunOpNotLastPara() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IDENTIFIER:
    CTreeStrConstant jjtn001 = new CTreeStrConstant(JJTSTRCONSTANT);
    boolean jjtc001 = true;
    jjtree.openNodeScope(jjtn001);
      try {
        jj_consume_token(IDENTIFIER);
    jjtn001.setText(getToken(0).image);
        jj_consume_token(42);
      } finally {
    if (jjtc001) {
      jjtree.closeNodeScope(jjtn001, true);
    }
      }
      break;
    case FUNFIXED:
      CTreeStrConstant jjtn002 = new CTreeStrConstant(JJTSTRCONSTANT);
      boolean jjtc002 = true;
      jjtree.openNodeScope(jjtn002);
      try {
        jj_consume_token(FUNFIXED);
    jjtn002.setText(getToken(0).image);
        jj_consume_token(42);
      } finally {
      if (jjtc002) {
        jjtree.closeNodeScope(jjtn002, true);
      }
      }
      break;
    case FUNSHORTCIRCUIT:
      CTreeStrConstant jjtn003 = new CTreeStrConstant(JJTSTRCONSTANT);
      boolean jjtc003 = true;
      jjtree.openNodeScope(jjtn003);
      try {
        jj_consume_token(FUNSHORTCIRCUIT);
    jjtn003.setText(getToken(0).image);
        jj_consume_token(42);
      } finally {
      if (jjtc003) {
        jjtree.closeNodeScope(jjtn003, true);
      }
      }
      break;
    default:
      jj_la1[19] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void FunOpLastPara() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IDENTIFIER:
    CTreeStrConstant jjtn001 = new CTreeStrConstant(JJTSTRCONSTANT);
    boolean jjtc001 = true;
    jjtree.openNodeScope(jjtn001);
      try {
        jj_consume_token(IDENTIFIER);
    jjtn001.setText(getToken(0).image);
        jj_consume_token(41);
      } finally {
    if (jjtc001) {
      jjtree.closeNodeScope(jjtn001, true);
    }
      }
      break;
    case FUNFIXED:
      CTreeStrConstant jjtn002 = new CTreeStrConstant(JJTSTRCONSTANT);
      boolean jjtc002 = true;
      jjtree.openNodeScope(jjtn002);
      try {
        jj_consume_token(FUNFIXED);
    jjtn002.setText(getToken(0).image);
        jj_consume_token(41);
      } finally {
      if (jjtc002) {
        jjtree.closeNodeScope(jjtn002, true);
      }
      }
      break;
    case FUNSHORTCIRCUIT:
      CTreeStrConstant jjtn003 = new CTreeStrConstant(JJTSTRCONSTANT);
      boolean jjtc003 = true;
      jjtree.openNodeScope(jjtn003);
      try {
        jj_consume_token(FUNSHORTCIRCUIT);
    jjtn003.setText(getToken(0).image);
        jj_consume_token(41);
      } finally {
      if (jjtc003) {
        jjtree.closeNodeScope(jjtn003, true);
      }
      }
      break;
    default:
      jj_la1[20] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  private boolean jj_2_2(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  private boolean jj_2_3(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  private boolean jj_2_4(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_4(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  private boolean jj_2_5(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_5(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(4, xla); }
  }

  private boolean jj_3_1() {
    if (jj_scan_token(FUNSHORTCIRCUIT)) return true;
    if (jj_scan_token(40)) return true;
    return false;
  }

  private boolean jj_3R_12() {
    if (jj_scan_token(FUNFIXED)) return true;
    if (jj_scan_token(42)) return true;
    return false;
  }

  private boolean jj_3_5() {
    if (jj_3R_7()) return true;
    return false;
  }

  private boolean jj_3R_10() {
    if (jj_scan_token(FUNSHORTCIRCUIT)) return true;
    if (jj_scan_token(41)) return true;
    return false;
  }

  private boolean jj_3_4() {
    if (jj_3R_6()) return true;
    return false;
  }

  private boolean jj_3R_11() {
    if (jj_scan_token(IDENTIFIER)) return true;
    if (jj_scan_token(42)) return true;
    return false;
  }

  private boolean jj_3R_7() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_11()) {
    jj_scanpos = xsp;
    if (jj_3R_12()) {
    jj_scanpos = xsp;
    if (jj_3R_13()) return true;
    }
    }
    return false;
  }

  private boolean jj_3R_9() {
    if (jj_scan_token(FUNFIXED)) return true;
    if (jj_scan_token(41)) return true;
    return false;
  }

  private boolean jj_3_3() {
    if (jj_scan_token(IDENTIFIER)) return true;
    if (jj_scan_token(40)) return true;
    return false;
  }

  private boolean jj_3_2() {
    if (jj_scan_token(FUNFIXED)) return true;
    if (jj_scan_token(40)) return true;
    return false;
  }

  private boolean jj_3R_6() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_8()) {
    jj_scanpos = xsp;
    if (jj_3R_9()) {
    jj_scanpos = xsp;
    if (jj_3R_10()) return true;
    }
    }
    return false;
  }

  private boolean jj_3R_8() {
    if (jj_scan_token(IDENTIFIER)) return true;
    if (jj_scan_token(41)) return true;
    return false;
  }

  private boolean jj_3R_13() {
    if (jj_scan_token(FUNSHORTCIRCUIT)) return true;
    if (jj_scan_token(42)) return true;
    return false;
  }

  /** Generated Token Manager. */
  public ParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;
  private int jj_gen;
  final private int[] jj_la1 = new int[21];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0xf0000000,0xf0000000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x9f00080,0x9f00080,0x9f00080,0x9f00080,0x9f00080,0x0,0x0,0x9f00080,0x0,0x9f00080,0x1c00000,0x1c00000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x3,0x3,0x4,0x18,0x18,0x60,0x60,0x80,0x18,0x118,0x718,0x718,0x718,0x100,0x600,0x600,0x118,0x600,0x718,0x0,0x0,};
   }
  final private JJCalls[] jj_2_rtns = new JJCalls[5];
  private boolean jj_rescan = false;
  private int jj_gc = 0;

  /** Constructor with InputStream. */
  public Parser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Parser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new ParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 21; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 21; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public Parser(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new ParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 21; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 21; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public Parser(ParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 21; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(ParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 21; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static private final class LookaheadSuccess extends java.lang.Error { }
  final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;
  private int[] jj_lasttokens = new int[100];
  private int jj_endpos;

  private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[43];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 21; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 43; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

  private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 5; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
            case 3: jj_3_4(); break;
            case 4: jj_3_5(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

                    }