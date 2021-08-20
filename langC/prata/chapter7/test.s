	.file	"test.c"
	.text
	.section	.rodata
.LC0:
	.string	"hello"
.LC2:
	.string	"%.2lf\n"
.LC4:
	.string	"Elapsed: %f seconds\n"
	.text
	.globl	main
	.type	main, @function
main:
.LFB0:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	call	clock@PLT
	movq	%rax, -16(%rbp)
.L2:
	endbr64
	leaq	.LC0(%rip), %rdi
	call	puts@PLT
	movq	.LC1(%rip), %rax
	movq	%rax, %xmm0
	leaq	.LC2(%rip), %rdi
	movl	$1, %eax
	call	printf@PLT
	call	clock@PLT
	movq	%rax, -8(%rbp)
	movq	-8(%rbp), %rax
	subq	-16(%rbp), %rax
	cvtsi2sdq	%rax, %xmm0
	movsd	.LC3(%rip), %xmm1
	divsd	%xmm1, %xmm0
	leaq	.LC4(%rip), %rdi
	movl	$1, %eax
	call	printf@PLT
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE0:
	.size	main, .-main
	.section	.rodata
	.align 8
.LC1:
	.long	0
	.long	1074266112
	.align 8
.LC3:
	.long	0
	.long	1093567616
	.ident	"GCC: (Ubuntu 9.3.0-17ubuntu1~20.04) 9.3.0"
	.section	.note.GNU-stack,"",@progbits
	.section	.note.gnu.property,"a"
	.align 8
	.long	 1f - 0f
	.long	 4f - 1f
	.long	 5
0:
	.string	 "GNU"
1:
	.align 8
	.long	 0xc0000002
	.long	 3f - 2f
2:
	.long	 0x3
3:
	.align 8
4:
