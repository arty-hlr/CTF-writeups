
.section .text
.global _start

_start:
.code 32
add r3, pc, #1
bx r3

.code 16
mov r1, pc
add r1, #12
eor r2, r2, r2
strb r2, [r1, #7]
mov r7, #120
ldr r0,=18862
svc #1

.ascii "protectx"
