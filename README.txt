
    
                                           
 _|_|_|_|        _|                      _|_|_|  
 _|            _|_|_|_|    _|_|        _|        
 _|_|_|          _|      _|    _|      _|        
 _|              _|      _|    _|      _|        
 _|                _|_|    _|_|          _|_|_|  




FahrenheitToCelsius



# Contact: https://www.linkedin.com/in/steadfastpine/

# Release Date: 2019-07-10
# Version: .1



Description

	Converts temperatures in Fahrenheit To Celsius



Prerequisites

		Java Virtual Machine


Installation

		Download and unzip the program files, then change working directory to them:
		
			# cd FahrenheitToCelsius






License 

	This program is licensed under the GPL License, view the LICENSE.md file for more information.





































------------------------------------------------------------------------------------------














# Program:	Word Generator
# Created:	2018-03-15
# Version:	.1
# Language:	Shell

# Author:	Scott Forsberg
# Contact:	contact.scottforsberg@gmail.com
# Website:	https://github.com/pinebase/



Description

Generate words of various lengths and composition. Types include randomly generated words, and compound words made up of smaller terms.



Installation

Change directory to the folder which contains the word generator program. Then, access the program via the "./" command prefix to specify filed located in the current working directory.

example:

cd /home/username/Downloads/word-generator
$ ./wg.sh 



Copywrite

MIT Liscense



Options

		Word Generator - (wg)

		switch options

		-l 	set number of letters per word 5-7
			default is 6

		-r	use real words, combinations of 3 and 4 letter random words

		-v 	enables verbose output

		-w 	set number of words to generate, default is 1

		-? 	display options



		Word Generator Domian Check - (wg-domain-check)

		switch options

		-a	check words found in ~/.word-generator/words_to_check.txt
			default setting
			overrides inididual word input check

		-i 	input word
			example: ./check.sh i test -v

		-v 	enables verbose output

		-? 	display options






