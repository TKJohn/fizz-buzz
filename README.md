FizzBuzz
===========
你是一名体育老师，在某次课距离下课还有五分钟时，你决定搞一个游戏。此时有n名学生在上课。游戏的规则是：
让所有学生拍成一队，然后按顺序报数。
学生报数时，如果所报数字是3的倍数，那么不能说该数字，而要说Fizz；如果所报数字是5的倍数，那么要说Buzz；如果所报数字是7的倍数，那么要说Whizz。
学生报数时，如果所报数字同时是两个特殊数的倍数情况下，也要特殊处理，比如3和5的倍数，那么不能说该数字，而是要说FizzBuzz, 以此类推。如果同时是三个特殊数的倍数，那么要说FizzBuzzWhizz。
学生报数时，如果所报数字包含了3，那么也不能说该数字，而是要说相应的单词，比如要报13的同学应该说Fizz。
如果数字中包含了3，那么忽略规则2和规则3，比如要报30的同学只报Fizz，不报FizzBuzz。
如果数字中包含了5，那么忽略规则4和规则5，并且忽略被3整除的判定，比如要报35的同学不报Fizz，报BuzzWhizz。
如果数字中包含了7，那么忽略规则6，并且忽略被5整除的判定，比如要报75的同学只报Fizz，其他case自己补齐。
现在，我们需要你完成一个程序来模拟这个游戏，他的输出应该是输出（片段）：
1
2
Fizz
4
Buzz
Fizz
Whizz
8
Fizz
Buzz
11
Fizz 
Fizz
Wihzz
Buzz
… 
一直到n 
你只需要实现核心逻辑就可以了。假设最外面已经有一个循环，比如：
for( int i = 0; i < n; i++) {
    String result = fizzBuzz(i+1);
    System.out.println(result);
}
你只需要实现里面的fizzBuzz函数，用TDD的方式。