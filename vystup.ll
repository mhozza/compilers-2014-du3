declare i32 @printInt(i32)
declare i32 @iexp(i32, i32)
define i32 @main() {
start:
%R0 = add i32 0, 10
%R1 = add i32 0, 5
%R2 = call i32 @iexp(i32 %R0, i32 %R1)
call i32 @printInt (i32 %R2)
%R3 = add i32 0, 10
%R4 = alloca i32
store i32 %R3, i32* %R4
%R5 = add i32 0, 20
%R6 = alloca i32
store i32 %R5, i32* %R6
%R7 = add i32 0, 30
%R8 = alloca i32
store i32 %R7, i32* %R8
%R9 = load i32* %R4
%R10 = load i32* %R4
%R11 = sub i32 %R9, %R10
%R12 = icmp eq i32 %R11, 0
%R13 = zext i1 %R12 to i32
%R16 = icmp ne i32 %R13, 0
br i1 %R16, label %L0, label %L1
L0:
%R14 = load i32* %R8
call i32 @printInt (i32 %R14)
br label %L2
L1:
%R15 = load i32* %R4
call i32 @printInt (i32 %R15)
br label %L2
L2:
%R17 = add i32 0, 0
%R18 = load i32* %R4
%R19 = load i32* %R4
%R20 = sub i32 %R18, %R19
%R23 = icmp ne i32 %R20, 0
br i1 %R23, label %L3, label %L4
L3:
%R21 = load i32* %R8
call i32 @printInt (i32 %R21)
br label %L5
L4:
%R22 = load i32* %R4
call i32 @printInt (i32 %R22)
br label %L5
L5:
%R24 = add i32 0, 0
%R25 = add i32 0, 0
%R26 = alloca i32
store i32 %R25, i32* %R26
br label %L6
L6:
%R27 = load i32* %R26
%R28 = add i32 0, 10
%R29 = sub i32 %R27, %R28
%R34 = icmp ne i32 %R29, 0
br i1 %R34, label %L7, label %L8
L7:
%R30 = load i32* %R26
%R31 = add i32 0, 1
%R32 = add i32 %R30, %R31
store i32 %R32, i32* %R26
%R33 = load i32* %R26
call i32 @printInt (i32 %R33)
br label %L6
L8:
%R35 = add i32 0, 0
%R36 = load i32* %R4
%R37 = add i32 0, 0
%R38 = icmp ne i32 %R36, 0
%R39 = icmp ne i32 %R37, 0
%R40 = and i1 %R38, %R39
%R41 = zext i1 %R40 to i32
call i32 @printInt (i32 %R41)
%R42 = load i32* %R4
%R43 = add i32 0, 0
%R44 = icmp ne i32 %R42, 0
%R45 = icmp ne i32 %R43, 0
%R46 = or i1 %R44, %R45
%R47 = zext i1 %R46 to i32
call i32 @printInt (i32 %R47)
%R48 = load i32* %R4
%R49 = load i32* %R6
%R50 = add i32 %R48, %R49
call i32 @printInt (i32 %R50)
%R51 = load i32* %R4
%R52 = load i32* %R6
%R53 = sub i32 %R51, %R52
call i32 @printInt (i32 %R53)
%R54 = load i32* %R4
%R55 = load i32* %R6
%R56 = mul i32 %R54, %R55
call i32 @printInt (i32 %R56)
%R57 = load i32* %R6
%R58 = load i32* %R4
%R59 = sdiv i32 %R57, %R58
call i32 @printInt (i32 %R59)
%R60 = load i32* %R4
%R61 = add i32 0, 5
%R62 = call i32 @iexp(i32 %R60, i32 %R61)
call i32 @printInt (i32 %R62)
%R63 = add i32 0, 3
%R64 = add i32 0, 4
%R65 = alloca i32*, i32 2
%R66 = getelementptr i32** %R65, i32 0
%R68 = getelementptr i32** %R65, i32 1
%R67 = alloca i32
%R69 = alloca i32
store i32 %R63, i32* %R67
store i32 %R64, i32* %R69
store i32* %R67, i32** %R66
store i32* %R69, i32** %R68
store i32 %R65, i32* %R8
%R70 = load i32* %R8
%R71 = load i32* %R4
%R72 = alloca i32*, i32 2
%R73 = getelementptr i32** %R72, i32 0
%R75 = getelementptr i32** %R72, i32 1
%R74 = alloca i32
%R76 = alloca i32
store i32 %R70, i32* %R74
store i32 %R71, i32* %R76
store i32* %R74, i32** %R73
store i32* %R76, i32** %R75
%R77 = alloca i32
store i32* %R72, i32* %R77
ret i32 0
}
