/**
  * file: matrix.java
  * author: Steven O'Meara
  * course: CMPT 440
  * assignment: Milestone 2
  * due date: May 2, 2016
  * version: 1.3
  * 
  * This file contains the declaration of the matrix abstract data type as well as set up the states that are needed.
  */
public class matrix 
{
  //Set up all of the states
  public static final int q0 = 0;
  public static final int q1 = 1;
  public static final int q2 = 2;
  public static final int q3 = 3;
  public static final int q4 = 4;
  public static final int q5 = 5;
  public static final int q6 = 6;
  public static final int q7 = 7;
  public static final int q8 = 8;
  public static final int q9 = 9;
  public static final int q10 = 10;
  public static final int q11 = 11;
  public static final int q12 = 12;
  public static final int q13 = 13;
  public static final int q14 = 14;
  public static final int q15 = 15;
  public static final int q16 = 16;
  public static final int q17 = 17;
  public static final int q18 = 18;
  public static final int q19 = 19;
  public static final int q20 = 20;
  public static final int q21 = 21;
  public static final int q22 = 22;
  public static final int q23 = 23;
  public static final int q24 = 24;
  public static final int q25 = 25;
  public static final int q26 = 26;
  public static final int q27 = 27;
  public static final int q28 = 28;
  public static final int q29 = 29;
  public static final int q30 = 30;
  public static final int q31 = 31;
  public static final int q32 = 32;
  public static final int q33 = 33;
  public static final int q34 = 34;
  public static final int q35 = 35;
  public static final int q36 = 36;
  public static final int q37 = 37;
  public static final int q38 = 38;
  public static final int q39 = 39;
  public static final int q40 = 40;
  public static final int q41 = 41;
  public static final int q42 = 42;
	
  /**
   * DFAmatrix
   * 
   * This is used to build out the complete matrix for the entire DFA, it can then be made into a new matrix object in the lex function.
   */
  public int[][] DFAmatrix = 
    {
      //Starting state
      //      a,  b,  c,  d,  e,  f,  g,  h,  i,  j,  k,  l,  m,  n,  o,  p, q,  r,  s,  t,  u,  v,  w,  x,  y,  z,  0,  1,  2,  3,  4,  5,  6,  7,  8,  9,  *,  -,  ",  (,  ),  +,  =, nl,sp
      /*q0*/{q18,q18,q18,q18,q18,q18,q18,q18,q18,q18,q18,q18,q18,q18,q18,q1,q18,q18,q18,q18,q18,q30,q18,q18,q18,q18,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q35,q41,q41,q41,q41,q41,q41,q0,q0},
      //Start of PrintStmt check
      /*q1*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q19,q41,q2,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q19},
      /*q2*/{q41,q41,q41,q41,q41,q41,q41,q41,q3,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41},
      /*q3*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q4,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41},
      /*q4*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q42,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41},
      /*q5*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q6,q41,q41,q41,q41,q41},
      /*q6*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q7},
      /*q7*/{q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q13,q13,q13,q13,q13,q13,q13,q13,q13,q13,q41,q41,q8,q41,q41,q41,q41,q41,q41},
      /*q8*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q9},
      /*q9*/{q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q10},
      /*q10*/{q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q11,q41,q41,q41,q41,q41,q10},
      /*q11*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q12},
      /*q12*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q17,q41,q41,q41,q41},
      /*q13*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q14},
      /*q14*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q17,q15,q41,q41,q41},
      /*q15*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q16},
      /*q16*/{q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q13,q13,q13,q13,q13,q13,q13,q13,q13,q13,q41,q41,q8,q41,q41,q41,q41,q41,q41},
      /*q17*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q0,q0},
      //Start of AssignStmt check
      //       a,  b,  c,  d,  e,  f,  g,  h,  i,  j,  k,  l,  m,  n,  o,  p,  q,  r,  s,  t,  u,  v,  w,  x,  y,  z,  0,  1,  2,  3,  4,  5,  6,  7,  8,  9,  *,  -,  ",  (,  ),  +,  =, nl, sp
      /*q18*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q19},
      /*q19*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q20,q41,q41},
      /*q20*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q21},
      /*q21*/{q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q25,q25,q25,q25,q25,q25,q25,q25,q25,q25,q41,q41,q22,q41,q41,q41,q41,q41,q41},
      /*q22*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q23},
      /*q23*/{q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q24},
      /*q24*/{q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q29,q41,q41,q41,q41,q41,q24},
      /*q25*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q26},
      /*q26*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q27,q41,q41,q41},
      /*q27*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q28},
      /*q28*/{q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q25,q25,q25,q25,q25,q25,q25,q25,q25,q25,q41,q41,q22,q41,q41,q41,q41,q41,q41},
      /*q29*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q0,q0},
      //Start of VarDecl check
      //       a,  b,  c,  d,  e,  f,  g,  h,  i,  j,  k,  l,  m,  n,  o,  p,  q,  r,  s,  t,  u,  v,  w,  x,  y,  z,  0,  1,  2,  3,  4,  5,  6,  7,  8,  9,  *,  -,  ",  (,  ),  +,  =, nl, sp
      /*q30*/{q31,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q19},
      /*q31*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q32,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41},
      /*q32*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q33},
      /*q33*/{q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41},
      /*q34*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q0,q0},
      //Start of Comment check
      //       a,  b,  c,  d,  e,  f,  g,  h,  i,  j,  k,  l,  m,  n,  o,  p,  q,  r,  s,  t,  u,  v,  w,  x,  y,  z,  0,  1,  2,  3,  4,  5,  6,  7,  8,  9,  *,  -,  ",  (,  ),  +,  =, nl, sp
      /*q35*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q36,q41,q41,q41,q41,q41,q41,q41},
      /*q36*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q37},
      /*q37*/{q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q38},
      /*q38*/{q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q39,q41,q41,q41,q41,q41,q41,q38},
      /*q39*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q40,q41,q41,q41,q41,q41,q41,q41,q41},
      /*q40*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q0,q0},
      //Error State
      /*q41*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41},
      //Extra Space State for Print
      /*q42*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q5},
    };
		
}
