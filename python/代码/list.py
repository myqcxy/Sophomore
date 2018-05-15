Python 2.7.13 (v2.7.13:a06454b1afa1, Dec 17 2016, 20:42:59) [MSC v.1500 32 bit (Intel)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> score = input("输入一个分数")
输入一个分数23
>>> score
23
>>> type(score)
<type 'int'>
>>> range(5)
[0, 1, 2, 3, 4]
>>> list(range(5))
[0, 1, 2, 3, 4]
>>> range(2,6)
[2, 3, 4, 5]
>>> for i in range(3,50)
SyntaxError: invalid syntax
>>> for i in range(3,50):
	print(i)

	
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
>>> for i in range(3,50):
	print(i,end='')
	
SyntaxError: invalid syntax
>>> for i in range(3,50):
	print(i,end=' ')
	
SyntaxError: invalid syntax
>>> f = 'fish'
>>> for i in f:
	print(i,end='')
	
SyntaxError: invalid syntax
>>> for i in f:
	print(i)

	
f
i
s
h
>>> menmber = [1,2,'sd']
>>> member

Traceback (most recent call last):
  File "<pyshell#19>", line 1, in <module>
    member
NameError: name 'member' is not defined
>>> member = [1,2,'sb']
>>> member
[1, 2, 'sb']
>>> member.append(4)
>>> member
[1, 2, 'sb', 4]
>>> member.insert(0,'sdf')
>>> member
['sdf', 1, 2, 'sb', 4]
>>> member.extend(['sdfds',123])
>>> member
['sdf', 1, 2, 'sb', 4, 'sdfds', 123]
>>> len(member)
7
>>> 
