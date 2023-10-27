package Chap7;

public class IPhoneMessenger extends GraphicIOS implements Messenger, WorkFile {
	
	public String getMessage() {
		return "iPhone";
	}
	
	public void setMessage(String msg) {
		System.out.println("iPhone에서 메세지를 설정합니다 : " + msg);
	}
	
	public void clearMessage() {
		System.out.println("좌우로 흔들어 문자열을 지웁니다.");
	}

	@Override
	public void fileUpload() {
		System.out.println("flie을 업로드합니다");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fileDownload() {
		System.out.println("flie을 다운로드합니다");
		// TODO Auto-generated method stub
		
	}

}
