INCLUDE Irvine32.inc
.386
;.model flat,stdcall
.stack 4096
ExitProcess proto,dwExitCode:dword

.data
	myString BYTE "CPSC 3303 Programming Project 3", 0, 

	promptSentence  BYTE "Please enter a sentence: ", 0; input prompt
	promptChar BYTE "Please enter a character: ", 0; input char

	buffer1    BYTE  64 DUP(00h) 
	buffer2    BYTE  64 DUP(00h)
	buffer3    BYTE 128 DUP(00h)
	byteCount1 DWORD ? 
	byteCount2 DWORD ? 
	byteCount3 DWORD ? 
	charCount  DWORD ?

	decLen     BYTE "Decimal length: ", 0
	hexLen     BYTE "Hex length: ", 0
	charOccur   BYTE "Occurances of char in string: ", 0

	firstSentence   BYTE "Please enter the first sentence: ", 0
	secondSentence  BYTE "Please enter the second sentence: ", 0
	

.code
main proc
	;display MyString
	mov	edx, OFFSET myString
	call WriteString
	call  carriageReturn
	call  carriageReturn

	call  Exercise1
	call  carriageReturn
	call  carriageReturn

	call  Exercise2
	call  carriageReturn
	call  carriageReturn

	call  Exercise3
	 
	invoke ExitProcess,0
main endp

	; --------------------------------------------
	;	Exercise 1 
	; --------------------------------------------
	Exercise1 PROC
		; Prompt for input
		mov   edx, OFFSET promptSentence
		call  WriteString

		; Get input
		mov   edx, OFFSET buffer1
		mov   ecx, SIZEOF buffer1
		call  ReadString
		mov   byteCount1, eax
		call  carriageReturn

		; Write decimal length 
		mov   edx, OFFSET decLen
		call  WriteString
		mov   eax, byteCount1
		call  WriteDec
		call  carriageReturn

		; Write hex length 
		mov   edx, OFFSET hexLen
		call  WriteString
		mov   eax, byteCount1
		call  WriteHex
		call  carriageReturn

		; output string 
		mov   edx, OFFSET buffer1
		call  WriteString
		call  carriageReturn

		ret
	Exercise1 ENDP


	; --------------------------------------------
	;	Exercise 2
	; --------------------------------------------
	Exercise2 PROC
		; Prompt the user for string
		mov edx, OFFSET promptSentence
		call  WriteString

		; Grab the input
		mov   edx, OFFSET buffer1
		mov   ecx, SIZEOF buffer1
		call  ReadString
		mov   byteCount1, eax

		; Prompt the user for char
		mov   edx, OFFSET promptChar
		call  WriteString

		; Grab the char
		call  ReadChar

		; Count number of occurances of char in string
		mov esi, OFFSET buffer1
		mov ecx, byteCount1
		mov edx, 00h; counter
		Compare :
		cmp[esi], al; if esi == al, increment counter
		jnz   jumpTo
		inc   edx
		jumpTo :
		inc   esi
		loop  compare
		

		; Write umber of occurances of char in string
		mov   charCount, edx
		call  carriageReturn
		mov   edx, OFFSET charOccur
		call  WriteString
		mov   eax, charCount
		call  WriteDec
		call carriageReturn

		ret
	Exercise2 ENDP

	; --------------------------------------------
	;	Exercise 3
	; --------------------------------------------
	Exercise3 PROC
		
		; Prompt for first sentence
		mov   edx, OFFSET firstSentence
		call  WriteString

		; Get input
		mov   edx, OFFSET buffer1
		mov   ecx, SIZEOF buffer1
		call  ReadString
		mov   byteCount1, eax

		; Prompt for second sentence
		mov   edx, OFFSET secondSentence
		call  WriteString

		; Get input
		mov   edx, OFFSET buffer2
		mov   ecx, SIZEOF buffer2
		call  ReadString
		mov   byteCount2, eax
		call  carriageReturn

		
		; prep copy buff1 to buff3
		cld
		mov   esi, OFFSET buffer1
		mov   edi, OFFSET buffer3
		mov   ecx, byteCount1; loop for the length of buff1
		rep   movsb; Copy the characters from buffer1 to buffer3

		; concat prep buff2 to buff3
		mov   esi, OFFSET buffer2
		mov   ecx, byteCount2; loop for the length of buff2
		rep   movsb

		; Store the length concatenated string 
		mov   edx, edi
		sub   edx, OFFSET buffer3
		mov   byteCount3, edx

		; Write concatenated string 
		mov   edx, OFFSET buffer3
		call  WriteString
		call  carriageReturn

		; Write decimal length
		mov   edx, OFFSET decLen
		call  WriteString
		mov   eax, byteCount3
		call  WriteDec
		call  carriageReturn

		; Write hex length
		mov   edx, OFFSET hexLen
		call  WriteString
		mov   eax, byteCount3
		call  WriteHex
		call  carriageReturn

		ret
	Exercise3 ENDP

	; --------------------------------------------
	;	carriage return 
	; --------------------------------------------
	carriageReturn PROC
	mov   al, 0Ah
	call  WriteChar
	mov   al, 0Dh
	call  WriteChar

	ret
	carriageReturn ENDP


end main