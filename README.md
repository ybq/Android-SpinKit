
# Android-SpinKit
##### Android loading animations(I wrote a android edition according [SpinKit](https://github.com/tobiasahlin/SpinKit))
## Preview 

<img src="https://raw.githubusercontent.com/ybq/AndroidSpinKit/master/art/screen.gif" width="240px" height="426px"/>
 
<img src="https://raw.githubusercontent.com/ybq/AndroidSpinKit/master/art/screen2.gif" width="200px" height="200px"/>

## Gradle Dependency

  1. Add the JitPack repository to your build file

```gradle
allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
```

  2.Add the dependency

``` gradle
dependencies {
    compile 'com.github.ybq:Android-SpinKit:1.0.4'
 }
```


## Usage

```xml
<com.github.ybq.android.spinkit.SpinKitView 
     xmlns:app="http://schemas.android.com/apk/res-auto"
     android:id="@+id/spin_kit"
     style="@style/SpinKitView.Large.Circle"
     android:layout_width="wrap_content"
     android:layout_height="wrap_content"
     android:layout_gravity="center"
     app:SpinKit_Color="@color/colorAccent" />         
``` 

```xml
@style/SpinKitView
@style/SpinKitView.Circle
@style/SpinKitView.Large
@style/SpinKitView.Small
@style/SpinKitView.Small.DoubleBounce                        
``` 
####ProgressBar

```java
ProgressBar progressBar = (ProgressBar)findViewById(R.id.progress);
DoubleBounce doubleBounce = new DoubleBounce();
progressBar.setIndeterminateDrawable(doubleBounce);
```

###Style:

Style | Preview
------------     |   -------------
RotatingPlane    | <img src='https://raw.githubusercontent.com/ybq/AndroidSpinKit/master/art/RotatingPlane.gif' alt='RotatingPlane' width="90px" height="90px"/>
DoubleBounce     | <img src='https://raw.githubusercontent.com/ybq/AndroidSpinKit/master/art/DoubleBounce.gif' alt='DoubleBounce' width="90px" height="90px"/>
Wave             | <img src='https://raw.githubusercontent.com/ybq/AndroidSpinKit/master/art/Wave.gif' alt='Wave' width="90px" height="90px"/>
WanderingCubes   | <img src='https://raw.githubusercontent.com/ybq/AndroidSpinKit/master/art/WanderingCubes.gif' alt='WanderingCubes' width="90px" height="90px"/>
Pulse            | <img src='https://raw.githubusercontent.com/ybq/AndroidSpinKit/master/art/Pulse.gif' alt='Pulse' width="90px" height="90px"/>
ChasingDots      | <img src='https://raw.githubusercontent.com/ybq/AndroidSpinKit/master/art/ChasingDots.gif' alt='ChasingDots' width="90px" height="90px"/>
ThreeBounce      | <img src='https://raw.githubusercontent.com/ybq/AndroidSpinKit/master/art/ThreeBounce.gif' alt='ThreeBounce' width="90px" height="90px"/>
Circle           | <img src='https://raw.githubusercontent.com/ybq/AndroidSpinKit/master/art/Circle.gif' alt='Circle' width="90px" height="90px"/>
CubeGrid         | <img src='https://raw.githubusercontent.com/ybq/AndroidSpinKit/master/art/CubeGrid.gif' alt='CubeGrid' width="90px" height="90px"/>
FadingCircle     | <img src='https://raw.githubusercontent.com/ybq/AndroidSpinKit/master/art/FadingCircle.gif' alt='FadingCircle' width="90px" height="90px"/>
FoldingCube      | <img src='https://raw.githubusercontent.com/ybq/AndroidSpinKit/master/art/FoldingCube.gif' alt='FoldingCube' width="90px" height="90px"/>
 
  
    
      
 
 
 
##Thanks 
- [SpinKit](https://github.com/tobiasahlin/SpinKit).


 
##LICENSE
 
	 Copyright ybq 2016
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
	    http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.





