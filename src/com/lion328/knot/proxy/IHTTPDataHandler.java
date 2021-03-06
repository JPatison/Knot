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

package com.lion328.knot.proxy;

import java.io.IOException;

import com.lion328.knot.http.HTTPRequest;
import com.lion328.knot.http.HTTPResponse;

public interface IHTTPDataHandler {
	
	public String getURLRegex();
	public HTTPResponse getPage(HTTPRequest request) throws IOException;
}
