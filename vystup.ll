declare i32 @printInt(i32)
declare i32 @iexp(i32, i32)
define i32 @F0(i32 %R7) {
start:
%R8 = alloca i32
store i32 %R7, i32* %R8
%R9 = add i32 0, 47
%R10 = alloca i32
store i32 %R9, i32* %R10
%R11 = load i32* %R10
%R12 = load i32* %R8
%R13 = mul i32 %R11, %R12
ret i32 %R13
}
define i32 @F1() {
start:
%R14 = add i32 0, 47
ret i32 %R14
}
define i32 @F2(i32 %R15, i32 %R16) {
start:
%R17 = alloca i32
store i32 %R15, i32* %R17
%R18 = alloca i32
store i32 %R16, i32* %R18
%R19 = load i32* %R17
%R20 = load i32* %R18
%R21 = add i32 %R19, %R20
ret i32 %R21
}
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
%R22 = add i32 0, 30
%R23 = alloca i32
store i32 %R22, i32* %R23
%R24 = load i32* %R4
%R25 = load i32* %R4
%R26 = sub i32 %R24, %R25
%R27 = icmp eq i32 %R26, 0
%R28 = zext i1 %R27 to i32
%R31 = icmp ne i32 %R28, 0
br i1 %R31, label %L0, label %L1
L0:
%R29 = load i32* %R23
call i32 @printInt (i32 %R29)
br label %L2
L1:
%R30 = load i32* %R4
call i32 @printInt (i32 %R30)
br label %L2
L2:
%R32 = add i32 0, 0
%R33 = load i32* %R4
%R34 = load i32* %R4
%R35 = sub i32 %R33, %R34
%R38 = icmp ne i32 %R35, 0
br i1 %R38, label %L3, label %L4
L3:
%R36 = load i32* %R23
call i32 @printInt (i32 %R36)
br label %L5
L4:
%R37 = load i32* %R4
call i32 @printInt (i32 %R37)
br label %L5
L5:
%R39 = add i32 0, 0
%R40 = add i32 0, 0
%R41 = alloca i32
store i32 %R40, i32* %R41
br label %L6
L6:
%R42 = load i32* %R41
%R43 = add i32 0, 10
%R44 = sub i32 %R42, %R43
%R49 = icmp ne i32 %R44, 0
br i1 %R49, label %L7, label %L8
L7:
%R45 = load i32* %R41
%R46 = add i32 0, 1
%R47 = add i32 %R45, %R46
store i32 %R47, i32* %R41
%R48 = load i32* %R41
call i32 @printInt (i32 %R48)
br label %L6
L8:
%R50 = add i32 0, 0
%R51 = load i32* %R4
%R52 = add i32 0, 0
%R53 = icmp ne i32 %R51, 0
%R54 = icmp ne i32 %R52, 0
%R55 = and i1 %R53, %R54
%R56 = zext i1 %R55 to i32
call i32 @printInt (i32 %R56)
%R57 = load i32* %R4
%R58 = add i32 0, 0
%R59 = icmp ne i32 %R57, 0
%R60 = icmp ne i32 %R58, 0
%R61 = or i1 %R59, %R60
%R62 = zext i1 %R61 to i32
call i32 @printInt (i32 %R62)
%R63 = load i32* %R4
%R64 = load i32* %R6
%R65 = add i32 %R63, %R64
call i32 @printInt (i32 %R65)
%R66 = load i32* %R4
%R67 = load i32* %R6
%R68 = sub i32 %R66, %R67
call i32 @printInt (i32 %R68)
%R69 = load i32* %R4
%R70 = load i32* %R6
%R71 = mul i32 %R69, %R70
call i32 @printInt (i32 %R71)
%R72 = load i32* %R6
%R73 = load i32* %R4
%R74 = sdiv i32 %R72, %R73
call i32 @printInt (i32 %R74)
%R75 = load i32* %R4
%R76 = add i32 0, 5
%R77 = call i32 @iexp(i32 %R75, i32 %R76)
call i32 @printInt (i32 %R77)
%R78 = add i32 0, 42
%R79 = call i32 @F0(i32 %R78)
%R80 = alloca i32
store i32 %R79, i32* %R80
%R81 = load i32* %R80
call i32 @printInt (i32 %R81)
%R82 = add i32 0, 1
%R83 = add i32 0, 2
%R84 = call i32 @F2(i32 %R82, i32 %R83)
call i32 @printInt (i32 %R84)
ret i32 0
}
