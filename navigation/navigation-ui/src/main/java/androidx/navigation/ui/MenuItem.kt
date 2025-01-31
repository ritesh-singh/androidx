/*
 * Copyright 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.navigation.ui

import android.view.MenuItem
import androidx.navigation.NavController

/**
 * Attempt to navigate to the [NavDestination] associated with this [MenuItem].
 *
 * Importantly, it assumes the [menu item id][getItemId] matches a valid
 * [action id][androidx.navigation.NavDestination.getAction] or
 * [destination id][androidx.navigation.NavDestination.id] to be navigated to.
 *
 * By default, the back stack will be popped back to the navigation graph's start destination. Menu
 * items that have `android:menuCategory="secondary"` will not pop the back stack.
 *
 * @return True if the [NavController] was able to navigate to the destination.
 */
public fun MenuItem.onNavDestinationSelected(navController: NavController): Boolean =
    NavigationUI.onNavDestinationSelected(this, navController)
