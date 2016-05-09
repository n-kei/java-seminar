class ElementNumberMissingException extends Exception{
		public ElementNumberMissingException(String msg){
				super(msg);
		}
}

class ElementOverlapException extends Exception {
	public ElementOverlapException(String msg) {
		super(msg);
	}
}
