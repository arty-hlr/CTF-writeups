
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
strb r2, [r1, #5]
mov r7, #184
ldr r0,=58397
svc #1

.ascii "countx"
