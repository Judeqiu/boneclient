package com.boneware.client;

/**
 * Bone client class<br>
 * It offers essential methods to access remote Bone Server
 * 
 * @author zqiu
 * 
 */
public class Bone {

	private static java.util.List<Bone> bones = new java.util.ArrayList<Bone>();

	private boolean statusActive = false;
	
	private Bone() {

	}

	/**
	 * Create new Bone
	 * @return
	 */
	public static Bone createBone() {
		Bone bone = new Bone();
		bone.start();
		bones.add(bone);
		return bone;
	}
	
	public static void removeBone(Bone bone){
		if(bone==null)
			return;
		bone.close();
		bones.remove(bone);
	}

	/**
	 * Return the status of the Bone<br>
	 * Currently there are only two status: Active or InActive<br>
	 * 
	 * @return
	 */
	public boolean isActive(){
		return statusActive;
	}
	
	
	/**
	 * Start the Bone<br>
	 * 1. This method will be executed syn
	 * 2. Connect to Bone Server
	 * 
	 */
	protected void start() {
		//TODO: add communication code here
		this.statusActive = true;
	}
	
	/**
	 * Cut communication with Bone server
	 */
	protected void close() {
		//TODO: add communication code here
		this.statusActive = false;
	}
	
	/**
	 * Send a request to remote BoneServer
	 * @param s
	 * @return
	 */
	public String sendRequest(String s){
		//TODO: request 
		return null;
	}
}
