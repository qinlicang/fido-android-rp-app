/*
* Copyright Daon.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.daon.identityx.controller.model;

public enum AuthenticationMethod {

	USERNAME_PASSWORD("Username and password"),
	FIDO_AUTHENTICATION("FIDO Authentication");
	
	private final String description;
	
	AuthenticationMethod(String aDescription) {
		this.description = aDescription;
	}

	public String getDescription() {
		return description;
	}
	
	public String toString() {
		return this.getDescription();
	}
	
}
