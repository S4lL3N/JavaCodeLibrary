INCLUDE Irvine32.inc
.386
;.model flat,stdcall
.stack 4096
ExitProcess proto,dwExitCode:dword

.data
	myString BYTE "CPSC 3303 Programming Project 2", 0dh, 0ah
	
.code
main proc
	;display MyString
	mov	edx,OFFSET myString
	call WriteString

	;===================================================================================
	;Exercise 1

	;for tests assign various values to from 0 - 9 into the AL register.

	;set AL to 00h
	mov al, 00h
	
	;set AL to 06h
	mov al, 06h

	;set AL to 02h
	mov al, 02h

	;set AL to 09h
	mov al, 09h

	;The ReadChar procedure reads a single character from the keyboard and returns
	;the character in the AL register.
	call ReadChar

	;set DL to AL
	mov dl, al

	;The WriteChar procedure writes a single character to the console window. Pass the
	;character (or its ASCII code) in AL.
	call WriteChar

	;===================================================================================
	;line feed = 0Ah
	mov al, 0Ah
	call WriteChar

	;carriage return = 0Dh
	mov al, 0Dh
	call WriteChar

	;===================================================================================
	;Exercise 2

	;set AL to 94h
	mov al, 94h

	;move al to dh
	mov dh, al

	;shift to get proper values
	shr dx, 4
	shr dl, 4

	;add 30 to get the ascii values
	add dh, 30h
	add dl, 30h

	;move back to al to display equvilant ascii values.
	mov al, dh
	call WriteChar
	mov al, dl
	call WriteChar

	;Display ‘h’ to indicate that the number is a hexadecimal number.
	mov al, 68h
	call WriteChar


	;===================================================================================
	;line feed = 0Ah
	mov al, 0Ah
	call WriteChar

	;carriage return = 0Dh
	mov al, 0Dh
	call WriteChar

	;===================================================================================
	;Exercise 3

	;read decimal # from keyboard
	call readChar

	;and to get the value of the digit 0-9 (30h - 39h).
	and AL, 0Fh

	;store the value of the digit in the DL register
	mov DL, AL

	;===================================================================================
	;line feed = 0Ah
	mov al, 0Ah
	call WriteChar

	;carriage return = 0Dh
	mov al, 0Dh
	call WriteChar

	;===================================================================================
	;Exercise 4

	;read in two decimal digits 
	call ReadChar
	mov dh, al
	call ReadChar
	mov dl, al

	;shift to get proper MSN and LSN
	shl dl, 4
	shl dx, 4

	;move back to AL
	mov al, dh
	
	;===================================================================================

	invoke ExitProcess,0
main endp
end main