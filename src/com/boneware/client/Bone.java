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

	private Bone() {

	}

	/**
	 * Create new Bone
	 * @return
	 */
	public static Bone createBone() {
		Bone bone = new Bone();
		bones.add(bone);
		return bone;
	}
	
	

}
