declare i32 @printInt(i32)
declare i32 @printFloat(float)
declare i32 @iexp(i32, i32)
declare float @fexp(float, float)
declare float @IntToFloat(i32)
declare i32 @FloatToInt(float)
define i32 @main() {
start:
%R0 = add i32 0, 10
%R1 = add i32 0, 5
%R2 = call i32 @iexp(i32 %R0, i32 %R1)
call i32 @printInt (i32 %R2)
%R3 = alloca i32
%R4 = alloca i32
%R5 = alloca i32
%R6 = add i32 0, 10
store i32 %R6, i32* %R3
%R7 = add i32 0, 20
store i32 %R7, i32* %R4
%R8 = add i32 0, 30
store i32 %R8, i32* %R5
%R9 = load i32* %R3
%R10 = load i32* %R3
%R11 = sub i32 %R9, %R10
%R12 = icmp eq i32 %R11, 0
%R13 = zext i1 %R12 to i32
%R16 = icmp ne i32 %R13, 0
br i1 %R16, label %L0, label %L1
L0:
%R14 = load i32* %R5
call i32 @printInt (i32 %R14)
br label %L2
L1:
%R15 = load i32* %R3
call i32 @printInt (i32 %R15)
br label %L2
L2:
%R17 = add i32 0, 0
%R18 = load i32* %R3
%R19 = load i32* %R3
%R20 = sub i32 %R18, %R19
%R23 = icmp ne i32 %R20, 0
br i1 %R23, label %L3, label %L4
L3:
%R21 = load i32* %R5
call i32 @printInt (i32 %R21)
br label %L5
L4:
%R22 = load i32* %R3
call i32 @printInt (i32 %R22)
br label %L5
L5:
%R24 = add i32 0, 0
%R25 = alloca i32
%R26 = add i32 0, 0
store i32 %R26, i32* %R25
br label %L6
L6:
%R27 = load i32* %R25
%R28 = add i32 0, 10
%R29 = sub i32 %R27, %R28
%R34 = icmp ne i32 %R29, 0
br i1 %R34, label %L7, label %L8
L7:
%R30 = load i32* %R25
%R31 = add i32 0, 1
%R32 = add i32 %R30, %R31
store i32 %R32, i32* %R25
%R33 = load i32* %R25
call i32 @printInt (i32 %R33)
br label %L6
L8:
%R35 = add i32 0, 0
%R36 = load i32* %R3
%R37 = add i32 0, 0
%R38 = icmp ne i32 %R36, 0
%R39 = icmp ne i32 %R37, 0
%R40 = and i1 %R38, %R39
%R41 = zext i1 %R40 to i32
call i32 @printInt (i32 %R41)
%R42 = load i32* %R3
%R43 = add i32 0, 0
%R44 = icmp ne i32 %R42, 0
%R45 = icmp ne i32 %R43, 0
%R46 = or i1 %R44, %R45
%R47 = zext i1 %R46 to i32
call i32 @printInt (i32 %R47)
%R48 = load i32* %R3
%R49 = load i32* %R4
%R50 = add i32 %R48, %R49
call i32 @printInt (i32 %R50)
%R51 = load i32* %R3
%R52 = load i32* %R4
%R53 = sub i32 %R51, %R52
call i32 @printInt (i32 %R53)
%R54 = load i32* %R3
%R55 = load i32* %R4
%R56 = mul i32 %R54, %R55
call i32 @printInt (i32 %R56)
%R57 = load i32* %R4
%R58 = load i32* %R3
%R59 = sdiv i32 %R57, %R58
call i32 @printInt (i32 %R59)
%R60 = load i32* %R3
%R61 = add i32 0, 5
%R62 = call i32 @iexp(i32 %R60, i32 %R61)
call i32 @printInt (i32 %R62)
%R63 = alloca float
%R64 = fadd float 0.0, 1.5
%R65 = fadd float 0.0, 4.0
%R66 = fadd float %R64, %R65
store float %R66, float* %R63
%R67 = load float* %R63
call i32 @printFloat (float %R67)
%R68 = fadd float 0.0, 4.25
%R69 = fcmp ueq float %R68, 0.0
%R70 = uitofp i1 %R69 to float
call i32 @printFloat (float %R70)
%R71 = fadd float 0.0, 8.0
%R72 = fadd float 0.0, 3.5
%R73 = fcmp une float %R71, 0.0
%R74 = fcmp une float %R72, 0.0
%R75 = and i1 %R73, %R74
%R76 = uitofp i1 %R75 to float
call i32 @printFloat (float %R76)
%R77 = add i32 0, 4
%R78 = call float @IntToFloat(i32 %R77)%R79 = fadd float 0.0, 7.5
%R80 = fadd float %R78, %R79
call i32 @printFloat (float %R80)
%R81 = fadd float 0.0, 4.5
%R82 = call i32 @FloatToInt(float %R81)%R83 = add i32 0, 7
%R84 = add i32 %R82, %R83
call i32 @printInt (i32 %R84)
ret i32 0
}
