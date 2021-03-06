/*
   Copyright 2012 James Phillpotts

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

package potes.cucumberjvm.eclipseplugin.editors;

import org.eclipse.ui.editors.text.TextEditor;

public class CucumberEditor extends TextEditor {

	private ColorManager colorManager;

	public CucumberEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new FeatureConfiguration(colorManager));
		setDocumentProvider(new FeatureDocumentProvider());
	}
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

}
