INCLUDE Irvine32.inc
.386
;.model flat,stdcall
.stack 4096
ExitProcess proto,dwExitCode:dword

.data
	myString BYTE "CPSC 3303 Assignment", 0dh, 0ah
	
	

.code
main proc
	;display MyString
	mov	edx, OFFSET myString
	call WriteString

	
	;===================================================================================
	;	Exercise 6
	;===================================================================================
      call ReadHexByte
	  call SumFirstN
	  mov cl, DL
  
	  mov al, dh
	  call WriteSum
	  mov al, cl
	  call WriteHexByte	
		
    

	invoke ExitProcess,0
main endp

	;===================================================================================
	;		Procedures
	;===================================================================================

	;1 ===================================================================================

	DigitValue2ASCII PROC
		mov dl, al
		add dl, 30h
  
		cmp al, 0Ah
		jb endf
		add dl, 7h
		endf:

		ret
	DigitValue2ASCII ENDP

	;2 ===================================================================================

	WriteHexByte proc
		;most significant nibble
		mov dh, al 
		and al, 0F0h 
		shr al, 4 
		call DigitValue2ASCII 
		mov al, dl 
		call WriteChar 

		; least significant nibble
		mov al, dh 
		and al, 0Fh 
		call DigitValue2ASCII 
		mov al, dl 
		call WriteChar 

		; add h at the end
		mov al, 68h
		call WriteChar
		mov al, 0Ah 
		call WriteChar
		mov al, 0Dh 
		call WriteChar
		ret
	WriteHexByte endp

	;3 ===================================================================================

	ASCII2DigitValue PROC
		
		mov dl, al
		sub dl, 30h
	    
		cmp al, 40h
	    jb endf
		sub dl, 7h
		endf:

		ret
	ASCII2DigitValue ENDP

	;4 ===================================================================================

	ReadHexByte PROC
	    call ReadChar 
        call ASCII2DigitValue 
        call ReadChar 
        mov dh, dl 
        call ASCII2DigitValue 
        mov al, dl 
        shl dh, 4 
        add al, dh 
        ret 
	ReadHexByte ENDP

	;5 ===================================================================================

	SumFirstN proc
        mov ecx, 0h ;Set ecx to zero first
        mov cl, al ;move N into CL, determines the number of loops 
        mov dx, 0h ;start dx at 0
        mov bx, 1h ;number to add each loop, start at 1
    Sum:
        add dx, bx
        add bx, 1h  ;increment bx so next add is one more
        loop sum ;Loops unti ECX = 0
        ret ;Return to calling function

	SumFirstN endp
	; ===================================================================================
	writeSum proc
		mov bl, AL  
  
		; Write the first digit out
		shr al, 4
		call DigitValue2ASCII
		mov al, dl
		call WriteChar
  
		; Write the second digit out
		mov al, bl
		and al, 0Fh 
		call DigitValue2ASCII
		mov al, dl
		call WriteChar
  
		ret

	WriteSum endp

	;===================================================================================
	;	TESTING
	;===================================================================================
	testing proc
			 ;**********************
			 ;  DigitValue2ASCII
			 ;**********************
				 mov al, 4 ;move the value 4 to the AL register
				 call DigitValue2ASCII ;expected DL value = 34h


				 mov al, 0Ch ;move the value 0Ch(12) to the AL register.
				 call DigitValue2ASCII  ;expected DL value = 43h

			 ;*******************
			 ;  WriteHexByte
			 ;*******************
				 ;set AL to 94h
				 mov al, 94h
				 call WriteHexByte ;expected output to console "94h"

				 mov ax, 00E7h 
				 call WriteHexByte ;expected output to console "E7h"

			 ;**********************
			 ;  ASCII2DigitValue
			 ;***********************
				 ;set AL to 34h
				 mov al, 34h 
				 call ASCII2DigitValue ;expected DL value = 04h

				 ;set AL to 44h
				 mov al, 44h 
				 call ASCII2DigitValue ;expected DL value = 0Dh 

			 ;*******************
			 ;  ReadHexByte
			 ;*******************
				 ;for 94h example
				 call ReadHexByte ;expected AL value = 94h 

				 ;for B8h example        
				 call ReadHexByte ;expected AL value = B8h 

			 ;*******************
			 ;  SumFirstN
			 ;*******************
				;for 08h example
	             mov al, 08h
				 call SumFirstN ;expected dx value 24h = 36d

	testing endp
end main