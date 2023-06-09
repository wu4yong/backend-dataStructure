package com.qili.stack;

public class CharStack {
	private int maxSize;

	private char[] arr;

	private int top;

	// 构造方法
	public CharStack(int size) {
		maxSize = size;
		arr = new char[maxSize];
		top = -1;
	}

	// 压入数据
	public void push(char value){
		arr[++top]=value;
	}

	// 弹出数据
	public char pop() {
		return arr[top--];
	}

	// 访问栈顶元素
	public char peek() {
		return arr[top];
	}

	// 栈是否为空
	public boolean isEmpty() {
		return (top == -1);
	}

	// 栈是否满了
	public boolean isFull() {
		return (top == maxSize - 1);
	}

}
