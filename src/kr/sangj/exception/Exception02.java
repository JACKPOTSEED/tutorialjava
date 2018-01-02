package kr.sangj.exception;

public class Exception02{
	
	public void print() throws UserException{
		
		throw new UserException("에러발생!!!!");
	}
}
