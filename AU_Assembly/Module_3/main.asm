INCLUDE Irvine32.inc
.386
.model flat,stdcall
.stack 4096
ExitProcess proto, dwExitCode:dword

.code
	main proc
		mov	eax, 0FFFDh				
		inc eax
		inc eax
		inc eax
		mov eax, 0FFDh
		inc AL
		inc AL
		inc AL

		invoke ExitProcess,0

	main endp
end main
