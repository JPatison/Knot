/*
   Copyright 2014 Waritnan Sookbuntherng

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package com.lion328.knot.util;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {
	
	private static String stringFormat(byte[] hash) {
		return String.format("%032x", new BigInteger(1, hash));
	}
	
	public static byte[] getHash(byte[] data) throws RuntimeException, NoSuchAlgorithmException {
		return MessageDigest.getInstance("MD5").digest(data);
	}
	
	public static String getHashString(byte[] data) throws NoSuchAlgorithmException {
		return stringFormat(getHash(data));
	}
	
	public static byte[] getFileHash(File f) throws NoSuchAlgorithmException, RuntimeException, IOException {
		return getHash(Files.readAllBytes(f.toPath()));
	}
	
	public static String getFileHashString(File f) throws NoSuchAlgorithmException, RuntimeException, IOException {
		return stringFormat(getFileHash(f));
	}
}
