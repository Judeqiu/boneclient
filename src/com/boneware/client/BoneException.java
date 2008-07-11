package com.boneware.client;

/**
 * Runtime exception to be used in BoneClient
 * @author zqiu
 *
 */
public class BoneException extends RuntimeException {

	public BoneException() {
		super();
	}

	public BoneException(String message, Throwable cause) {
		super(message, cause);
	}

	public BoneException(String message) {
		super(message);
	}

	public BoneException(Throwable cause) {
		super(cause);
	}

}
