# 🔢 Counter with ViewModel App

A simple Android app that demonstrates how to use ViewModel to survive configuration changes (like screen rotation).
The app maintains a counter value even when the activity is recreated, showing the power of MVVM architecture.

# 📖 Concept Highlight

In Android, when the device is rotated, the Activity is destroyed and recreated.

Without ViewModel → the counter resets.

With ViewModel → the counter survives configuration change.

This app is built to learn ViewModel in MVVM.

# ⚙️ Features

Simple counter that increases with a button click

Counter value survives screen rotation

ViewModel (CounterViewModel) stores state outside the Activity lifecycle

MVVM pattern:

Model: Counter data (integer)

View: activity_main.xml

ViewModel: CounterViewModel.kt

# 🛠️ Tech Stack

Language: Kotlin

Architecture: MVVM

Libraries/Frameworks:

AndroidX Lifecycle ViewModel

# 📂 Project Structure

├── MainActivity.kt        # View - handles UI & observes ViewModel

├── CounterViewModel.kt    # ViewModel - holds counter state

└── res/layout/activity_main.xml

# 📸 Screenshot 

### BEFORE INCREMENT COUNTER
<img src="screenshots/counter_with_viewmodel_output1.jpg" alt="INITIAL" width="250"/>

### AFTER INCREMENT COUNTER
<img src="screenshots/counter_with_viewmodel_output2.jpg" alt="AFTER CHANGES" width="250"/>

	
# 🚀 Learning Outcomes

Difference between Activity lifecycle state vs ViewModel state

How ViewModel survives configuration changes

Clear separation between UI (View) and logic (ViewModel)

Basic MVVM pattern in Android

# ▶️ How to Run

Clone the repo   https://github.com/suhaniranka006/Counter_With_ViewModel.git

Open in Android Studio

Run on emulator or device

Click the button → rotate screen → notice the counter persists 🎉

# 🙌 Future Improvements

Add LiveData to automatically update UI when counter changes

Add DataBinding for cleaner MVVM

Extend to a Timer app or Stopwatch app using ViewModel
