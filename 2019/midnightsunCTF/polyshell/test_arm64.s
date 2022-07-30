
.section .text
.global _start

_start:
adr x1, #8
mov x8, #184
ldr x0,=58397
svc #1

string:
.asciz "count"
